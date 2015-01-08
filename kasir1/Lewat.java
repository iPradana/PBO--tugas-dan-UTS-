import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Lewat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lewat extends Actor
{
    /**
     * Act - do whatever the Lewat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean y=true;
    private int cross;
    private boolean x=true;
    public void act() 
    {
        // Add your action code here.
        setImage(new GreenfootImage("KASIR MCKEBAB SURABAYA",30,Color.green,Color.black));
        if(y==false){
            setLocation(getX()+3,getY());
        }
        else{
            setLocation(getX()-3,getY());
        }
        
        if(isAtEdge()){
            if(y==true){
                y=false;
            }
            else{
                y=true;
            }
        }
    }    
    public void setCross(int x){
        cross=x;
    }
    
    public int getCross(){return cross;}
}
