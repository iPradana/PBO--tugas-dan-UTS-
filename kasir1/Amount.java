import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Amount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Amount extends Actor
{
    /**
     * Act - do whatever the Amount wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int amount=0;
    public void act() 
    {
        // Add your action code here.
        setImage(new GreenfootImage(amount+"",48,Color.yellow,Color.red));
    }    
    public void amountPlus(){amount++;}
    public void amountMin(){if(amount>1){amount--;}}
    public void reset(){amount=0;}
    public int getA(){return amount;}
}
