package Parkir;

import java.util.Date;

public class DataParkir {
	
	private static String data [][] = new String [100][4];
	private static int count=0;
	private static String nopol;
	private static String tgl;
	
	//setter
	public static void setData(String plat){
		data[count][0]=plat;
		data[count][1]="A"+(count+1);
		data[count][2]=new Date().toString();
		data[count][3]="0";
		count++;
	}
	
	//getter
	public static String getNopol(String k){
		tgl="";
		nopol="";
		for(int i=0;i<data.length;i++){
			if(k.equalsIgnoreCase(data[i][1]) && data[i][3].equalsIgnoreCase("0")){
				nopol=data[i][0];
				data[i][3]="1";
			}
		}
		return nopol;
	}
	
	public String getTgl(){
		return tgl;
	}
	
	public static String getKarcis(){
		return data[count-1][1];
	}
}