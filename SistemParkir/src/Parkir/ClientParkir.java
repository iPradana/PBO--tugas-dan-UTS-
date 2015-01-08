package Parkir;

import java.io.*;
import java.net.*;
import java.util.*;

import javax.swing.JOptionPane;

public class ClientParkir {
	private static InetAddress host;
	private static final int PORT = 1;
	public static void main(String[] args)
	{
		try
		{
			host = InetAddress.getLocalHost();
			System.out.println("berhasil masuk....");
		}
		catch(UnknownHostException uhEx)
		{
			System.out.println("\nHost ID tidak ditemukan!\n");
			System.exit(1);
		}
		sendMessages();
	}
	private static void sendMessages()
	{
		Socket socket = null;
		try
		{
			socket = new Socket("192.168.43.15",PORT);
			Scanner networkInput =
					new Scanner(socket.getInputStream());
			PrintWriter networkOutput =
					new PrintWriter(
							socket.getOutputStream(),true);
			Scanner userEntry = new Scanner(System.in);
			int pil,pil2,pos;
			String plat;
			String server;
			int isi;
//------------------------------PROSES (MENU dll)------------------------------------------
			do
			{
				String sPil = JOptionPane.showInputDialog("1. Parkir masuk\n2. Parkir keluar\n3. Keluar");
				pil=Integer.parseInt(sPil);
				pos = 1;
				networkOutput.println(pos);
				networkOutput.println(pil);
				switch(pil){
				case 1:
					server = networkInput.nextLine();
					JOptionPane.showMessageDialog(null,server+"Client parkir masuk");
					do{
						pil2 = gatein(); //method ada di bagian bawah
						pos = 6;
						networkOutput.println(pos);
						isi = Integer.parseInt(networkInput.nextLine());
						if(pil2==1){
							if(isi==1){
								pos = 2;
								plat = JOptionPane.showInputDialog("Masukkan plat nomor");
								networkOutput.println(pos);
								networkOutput.println(plat);
								server = networkInput.nextLine();
								JOptionPane.showMessageDialog(null, server);
							}else{
								JOptionPane.showMessageDialog(null,"Parkir penuh");
								pil2=2;
							}
						}else{
							pil2=2;
						}
					}
					while(pil2<2);
					break;
				case 2:
					server = networkInput.nextLine();
					JOptionPane.showMessageDialog(null,server+"Client parkir keluar");
					do{
						pil2 = gateout(); //method ada di bagian bawah
						if(pil2==1){
							pos = 3;
							plat = JOptionPane.showInputDialog("Masukkan nomor karcis");
							networkOutput.println(pos);
							networkOutput.println(plat);
							server = networkInput.nextLine();
							JOptionPane.showMessageDialog(null, server);
						}else{
							System.out.println("");
						}
					}while(pil2<2);
				}
			}while (pil<3);
			pos = 7;
			networkOutput.println(pos);
		}

//-------------------------------------TUTUP MENU-----------------------------------------
		
		catch(IOException ioEx)
		{
			ioEx.printStackTrace();
		}
		finally
		{
			try
			{
				System.out.println(
						"\nPenutupan Koneksi...");
				socket.close();
			}
			catch(IOException ioEx)
			{
				System.out.println(
						"Unable to disconnect!");
				System.exit(1);
			}
		}
	}
	private static int gateout() {
		/*System.out.println("");
		System.out.print(	"Menu Gate-Out\n"+
							"1.check Out\n"+
							"2.keluar\n"+
							"Masukkan pilihan anda : ");
		*/
		String x = JOptionPane.showInputDialog("1. Check Out\n2. keluar");
		int y = Integer.parseInt(x);
		return y;
	}
	private static int gatein() {
		/*System.out.println("");
		System.out.print(	"Menu Gate-In\n"+
							"1.Masukkan plat nomor\n"+
							"2.keluar\n"+
							"Masukkan pilihan anda : ");
		*/
		String x = JOptionPane.showInputDialog("1. Masukkan plat nomor\n2. keluar");
		int y = Integer.parseInt(x);
		return y;
	}
}
