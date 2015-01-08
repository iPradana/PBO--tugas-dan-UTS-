package Parkir;

import java.io.*;

import Parkir.DataParkir;

import java.net.*;
import java.util.*;

public class ServerParkir {
	private static ServerSocket serverSocket;
	private static final int PORT = 1;
	public static void main(String[] args)
			throws IOException
			{
		try
		{
			serverSocket = new ServerSocket(PORT);
			System.out.println("MULTI CLIENT SERVER pada PORT:" + PORT);
		}
		catch (IOException ioEx)
		{
			System.out.println("\nTidak Dapat Membuka Port!");
			System.exit(1);
		}
		do
		{
			//Tunggu Koneksi
			System.out.println("Server Siap...");
			Socket client = serverSocket.accept();
			System.out.println("Client Baru ..masuk..");
			//Create a thread to handle communication with
			//this client and pass the constructor for this
			//thread a reference to the relevant socket...
			ClientHandler handler =
					new ClientHandler(client);
			handler.start();//As usual, method calls run .
		}while (true);
			}
}
class ClientHandler extends Thread
{
	private Socket client;
	private Scanner input;
	private PrintWriter output;
	private int karcis;
	private BufferedReader in;
	public ClientHandler(Socket socket)
	{
		//Set up reference to associated socket...
		client = socket;
		try
		{
			input = new Scanner(client.getInputStream());
			output = new PrintWriter(
					client.getOutputStream(),true);
			in = new BufferedReader(new InputStreamReader(client.getInputStream()));
		}
		catch(IOException ioEx){
			ioEx.printStackTrace();
		}
	}
	//------------------------------------------------------------------------------
	public void run()
	{
		try {
		String karcis,masuk,datak;
		int pil1,pil2,pos;
		do{
			pos = input.nextInt();
			if(pos==1){
				pil1 = input.nextInt();
				output.println("[server] anda masuk sebagai : ");
			}
			else if(pos==2){
				pil2 = input.nextInt();
				if(pil2==1){
					//masuk = input.next();		
					masuk = in.readLine();
					DataParkir.setData(masuk);
					output.println("[server] "+masuk+" masuk pada : "+new Date().toString()+
							"dengan no. karcis : "+DataParkir.getKarcis());
					System.out.println("kendaraan masuk dengan nopol "+masuk+"pada "+
							new Date().toString()+" dengan no. karcis : "+DataParkir.getKarcis());
				}
			}else if(pos==3){
				pil2 = input.nextInt();
				if(pil2==1){
					karcis = input.next();
					if(DataParkir.getNopol(karcis).equalsIgnoreCase("")){
						datak = "[server] data tidak ditemukan";
					}else{
						datak = "Kendaraan keluar dengan nopol "+
								DataParkir.getNopol(karcis)+" pada "+new Date().toString();
						System.out.println("Kendaraan keluar dengan nopol "+
								DataParkir.getNopol(karcis)+" pada "+new Date().toString()+
								" dengan no karcis : "+karcis);
					}
					output.println(datak);
				}
			}
		}while(pos<4);
		} catch (IOException e) {
			e.printStackTrace();
		}
	//-----------------------------------------------------------------------------
		try
		{
			if (client!=null)
			{
				System.out.println(
						"Menutup koneksi...sukses..");
				client.close();
			}
		}
		catch(IOException ioEx)
		{
			System.out.println("Gagal menutup koneksi!");
		}
	}
}
