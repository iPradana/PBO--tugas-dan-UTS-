import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cross here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cross extends Actor
{
    /**
     * Act - do whatever the Cross wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static String img;
    public static String img2;
    public void act() 
    {
        // Add your action code here.
        if(isTouching(Main.class)){
            getWorld().removeObject(this);
            GreenfootSound soundc = new GreenfootSound("candy.mp3");
            soundc.play();
        }
    }    
    public Cross(String c){
        setImage(c);
    }
    public Cross(){}
}
