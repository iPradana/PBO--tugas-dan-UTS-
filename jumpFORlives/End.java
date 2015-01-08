import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class End here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class End extends Actor
{
    /**
     * Act - do whatever the End wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean keluar;
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            if(keluar==true){
                Greenfoot.setWorld(new w0());
                getWorld().removeObject(((w1)getWorld()).tryAgain);
                getWorld().removeObject(((w1)getWorld()).exit);
            }
            else{
                Greenfoot.setWorld(new w1());
                getWorld().removeObject(((w1)getWorld()).exit);
                getWorld().removeObject(((w1)getWorld()).tryAgain);
            }
        }
    }    

    public End(String x,boolean y){
        setImage(x);
        keluar = y;
    }
}
