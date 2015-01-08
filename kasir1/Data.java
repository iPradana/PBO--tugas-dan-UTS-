import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.*;
/**
 * Write a description of class data here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Data extends Actor
{
    /**
     * Act - do whatever the data wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public String print=" - ";
    private String nama;
    private int harga;
    private int idx=1;
    public int font_size=48;
    private int amount=0;
    public static int ttl;
    public Color warna=Color.green;
    public void act() 
    {
        // Add your action code here.
        setImage(new GreenfootImage(print,font_size,warna,null));

    }    

    public void setPrint(String is,int ii){print=is+"\n Rp "+ii; harga=ii; nama=is;
        World w=getWorld();
        ((w1)w).getAmount().reset();
        ((w1)w).getAmount().amountPlus();
    }

    public void setColor(Color x){warna=x;}
    
    public void font(int i){font_size=i;}
    
    public void getA(){
        World w=getWorld();
        amount = ((w1)w).getAmount().getA();
    }

    public void simpan(){
        getA();
        if (amount!=0){
            if(idx==1){
                Data data1 = new Data();
                getWorld().addObject(data1,690,100);
                data1.harga = harga*amount;
                data1.amount=amount;
                data1.nama = nama;
                data1.font_size=20;
                data1.print = data1.nama+" ("+amount+") "+data1.harga;
                ttl+=data1.harga;
            }
            if(idx==2){
                Data data2 = new Data();
                getWorld().addObject(data2,690,130);
                data2.harga = harga*amount;
                data2.nama = nama;
                data2.font_size=20;
                data2.print = data2.nama+" ("+amount+") "+data2.harga;
                ttl+=data2.harga;
            }
            if(idx==3){
                Data data3 = new Data();
                getWorld().addObject(data3,690,160);
                data3.harga = harga*amount;
                data3.nama = nama;
                data3.font_size=20;
                data3.print = data3.nama+" ("+amount+") "+data3.harga;
                ttl+=data3.harga;
            }
            if(idx==4){
                Data data4 = new Data();
                getWorld().addObject(data4,690,190);
                data4.harga = harga*amount;
                data4.nama = nama;
                data4.font_size=20;
                data4.print = data4.nama+" ("+amount+") "+data4.harga;
                ttl+=data4.harga;
            }
            if(idx==5){
                Data data5 = new Data();
                getWorld().addObject(data5,690,220);
                data5.harga = harga*amount;
                data5.nama = nama;
                data5.font_size=20;
                data5.print = data5.nama+" ("+amount+") "+data5.harga;
                ttl+=data5.harga;
            }
            if(idx==6){
                Data data6 = new Data();
                getWorld().addObject(data6,690,250);
                data6.harga = harga*amount;
                data6.nama = nama;
                data6.font_size=20;
                data6.print = data6.nama+" ("+amount+") "+data6.harga;
                ttl+=data6.harga;
            }
            if(idx==7){
                Data data7 = new Data();
                getWorld().addObject(data7,690,280);
                data7.harga = harga*amount;
                data7.nama = nama;
                data7.font_size=20;
                data7.print = data7.nama+" ("+amount+") "+data7.harga;
                ttl+=data7.harga;
            }        
            World w=getWorld();
            ((w1)w).total.print = "TOTAL :\n"+ttl;
            ((w1)w).lewat.setCross(ttl);
            idx++;
        }
    }

    public int getTtl(){return ttl;}
}
