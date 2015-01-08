import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Shop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shop extends Menu
{
    /**
     * Act - do whatever the Shop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int candy=10;
    private String image;
    private boolean check;
    public static boolean k1,k2,k3,k4,k5,k6;
    public int data[] = new int [6];
    public void act() 
    {
        // Add your action code here.
        if(check==true && ((w0)getWorld()).select.getSlot()==2){
            checkLock();
            checkKlik();
            update();
        }
        else if(check==true && ((w0)getWorld()).select.getSlot()!=2){remove();}
    }    
    public Shop(){
        setImage(new GreenfootImage("Candy : "+candy,32,new Color(153,255,255),null));
        k1=true;
        check=true;
    }
    public Shop(String image){
        this.image=image;
        setImage(image);
    }
    public Shop(String text,int size,Color x,Color y){
        setImage(new GreenfootImage(text,size,x,y));
    }
    
    
    public void checkLock(){
        ((w0)getWorld()).C1.setLocation(300,200);
        ((w0)getWorld()).C2.setLocation(460,200);
        ((w0)getWorld()).C3.setLocation(300,300);
        ((w0)getWorld()).C4.setLocation(460,300);
        ((w0)getWorld()).C5.setLocation(300,400);
        ((w0)getWorld()).C6.setLocation(460,400);
        
        ((w0)getWorld()).Teks.setLocation(400,100);
        
        if(k2==false){((w0)getWorld()).L2.setLocation(460,200);((w0)getWorld()).t2.setLocation(530,200);}
        else if(k2==true){((w0)getWorld()).L2.setLocation(1,-100);}
        
        if(k3==false){((w0)getWorld()).L3.setLocation(300,300);((w0)getWorld()).t3.setLocation(370,300);}
        else if(k3==true){((w0)getWorld()).L3.setLocation(1,-100);}
        
        if(k4==false){((w0)getWorld()).L4.setLocation(460,300);((w0)getWorld()).t4.setLocation(530,300);}
        else if(k4==true){((w0)getWorld()).L4.setLocation(1,-100);}
        
        if(k5==false){((w0)getWorld()).L5.setLocation(300,400);((w0)getWorld()).t5.setLocation(370,400);}
        else if(k5==true){((w0)getWorld()).L5.setLocation(1,-100);}
        
        if(k6==false){((w0)getWorld()).L6.setLocation(460,400);((w0)getWorld()).t6.setLocation(530,400);}
        else if(k6==true){((w0)getWorld()).L6.setLocation(1,-100);}
        
    }
    
    public void checkKlik(){
        if(Greenfoot.mouseClicked(((w0)getWorld()).L2) && candy>=5){candy=candy-5;k2=true;}
        if(Greenfoot.mouseClicked(((w0)getWorld()).L3) && candy>=10){candy=candy-10;k3=true;}
        if(Greenfoot.mouseClicked(((w0)getWorld()).L4) && candy>=20){candy=candy-20;k4=true;}
        if(Greenfoot.mouseClicked(((w0)getWorld()).L5) && candy>=40){candy=candy-40;k5=true;}
        if(Greenfoot.mouseClicked(((w0)getWorld()).L6) && candy>=80){candy=candy-80;k6=true;}
        setImage(new GreenfootImage("Candy : "+candy,32,new Color(153,255,255),null));
    }
    
    public void remove(){
        ((w0)getWorld()).L1.setLocation(1,-100);
        ((w0)getWorld()).L2.setLocation(1,-100);
        ((w0)getWorld()).L3.setLocation(1,-100);
        ((w0)getWorld()).L4.setLocation(1,-100);
        ((w0)getWorld()).L5.setLocation(1,-100);
        ((w0)getWorld()).L6.setLocation(1,-100);
        
        ((w0)getWorld()).C1.setLocation(1,-100);
        ((w0)getWorld()).C2.setLocation(1,-100);
        ((w0)getWorld()).C3.setLocation(1,-100);
        ((w0)getWorld()).C4.setLocation(1,-100);
        ((w0)getWorld()).C5.setLocation(1,-100);
        ((w0)getWorld()).C6.setLocation(1,-100);
        
        ((w0)getWorld()).t2.setLocation(1,-100);
        ((w0)getWorld()).t3.setLocation(1,-100);
        ((w0)getWorld()).t4.setLocation(1,-100);
        ((w0)getWorld()).t5.setLocation(1,-100);
        ((w0)getWorld()).t6.setLocation(1,-100);
        
        ((w0)getWorld()).Teks.setLocation(1,-200);
    }
    public void update(){
        if(k1==true){data[0]=1;}
        if(k2==true){data[1]=1;}else if(k2==false){data[1]=0;}
        if(k3==true){data[2]=1;}else if(k3==false){data[2]=0;}
        if(k4==true){data[3]=1;}else if(k4==false){data[3]=0;}
        if(k5==true){data[4]=1;}else if(k5==false){data[4]=0;}
        if(k6==true){data[5]=1;}else if(k6==false){data[5]=0;}
    }
}
