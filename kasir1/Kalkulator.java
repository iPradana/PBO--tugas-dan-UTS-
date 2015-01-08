import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Kalkulator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kalkulator extends Actor
{
    /**
     * Act - do whatever the Kalkulator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String img="1.png";
    private int x=1;
    public void act() 
    {
        // Add your action code here.
        setImage(img);
        klik();
    }
    public void setImg(String img){this.img=img;}
    public void setX(int x){this.x=x;}
    public void klik(){
        if(Greenfoot.mouseClicked(this)&&x!=11){
            World w=getWorld();
            ((w2)w).getOut().setPrint(x);
            ((w2)w).h1.prt();
        }
        if(Greenfoot.mouseClicked(this)&&x==11){
            ((w2)getWorld()).h2.itung();
        }
    }
}
