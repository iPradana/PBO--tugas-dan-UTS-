import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hitung here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hitung extends Actor
{
    /**
     * Act - do whatever the Hitung wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        if(Greenfoot.mouseClicked(this)){
            
            w2 ww = new w2();
            Greenfoot.setWorld(ww);
        }
    }
}
