import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Duri here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Duri extends Actor
{
    /**
     * Act - do whatever the Duri wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(getX()+2,getY());
        if(getX()>900){
            setLocation(-300,getY());
        }
    }    
}
