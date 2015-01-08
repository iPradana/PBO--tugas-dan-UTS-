import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Min here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Min extends Amount
{
    /**
     * Act - do whatever the Min wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            World w=getWorld();
            ((w1)w).getAmount().amountMin();
        }
    }    
}
