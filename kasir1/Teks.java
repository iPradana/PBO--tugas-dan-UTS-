import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Teks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Teks extends Actor
{
    /**
     * Act - do whatever the Teks wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String print="0";
    private int font=72;
    private Color warna = Color.green;
    private int sum=0;
    boolean exit=false;
    public void act() 
    {
        // Add your action code here.
        setImage(new GreenfootImage(print,font,warna,null));
    }    
    public void setPrint(int x){
        sum=sum*10+x;
        if(x==10){
            sum=0;
        }
        print=sum+"";
    }
    public void setPrints(String a){print=a;}
    public int getSum(){return sum;}
    public void prt(){
        World w=getWorld();
        print=((w2)w).getOut().getSum()+"";
    }
    public void setFont(int f){font=f;}
    public void setColor(Color c){warna=c;}
    
    public void itung(){
        sum = ((((w2)getWorld()).getOut().sum)-(((w2)getWorld()).total.getTtl()));
        print = sum+"";
    }
}
