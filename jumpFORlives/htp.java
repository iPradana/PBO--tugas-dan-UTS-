import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class htp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class htp extends Menu
{
    /**
     * Act - do whatever the htp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setImage("htp.png");
        if(((w0)getWorld()).select.getSlot()==3){
            setLocation(407,300);
        }
        else{setLocation(1,-600);}
    }    
}
