package Parkir;
import java.io.*;
import java.net.*;
import java.util.*;

import javax.swing.JOptionPane;

public class LogParkir {
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
			BufferedReader in;
			Scanner networkInput =
					new Scanner(socket.getInputStream());
			PrintWriter networkOutput =
					new PrintWriter(
							socket.getOutputStream(),true);
			Scanner userEntry = new Scanner(System.in);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			int pos,pil;
			String sPil,server,cari,info;
//------------------------------PROSES (MENU dll)------------------------------------------
			do
			{
				sPil = JOptionPane.showInputDialog("1. Check sisa kapasitas\n"
						+ "2. Cari data parkir masuk dan keluar\n"
						+ "3. tutup koneksi");
				pil = Integer.parseInt(sPil);
				switch(pil){
				case 1 :
					pos = 4;
					networkOutput.println(pos);
					server = networkInput.nextLine();
					JOptionPane.showMessageDialog(null, server);
					break;
				case 2 :
					cari = JOptionPane.showInputDialog("Masukkan plat nomor");
					pos = 5;
					networkOutput.println(pos);
					networkOutput.println(cari);
					//server = networkInput.nextLine();
					server = in.readLine();
					if(!server.equalsIgnoreCase("")){
						info = in.readLine();
						info = info+"\n"+in.readLine();
						info = info+"\n"+in.readLine();
						JOptionPane.showMessageDialog(null, server+"\n"+info);
					}else{
						JOptionPane.showMessageDialog(null,"Data tidak ditemukan");
					}
					break;
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
}
