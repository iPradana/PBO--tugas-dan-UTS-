import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class item here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class item extends Actor
{
    /**
     * Act - do whatever the item wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String img;
    private String nama;
    private int harga;
    public void act() 
    {
        // Add your action code here.
        setImage(img);
        klik();
    }    
    public void setImg(String x){img=x;}
    public void setNama(String nama){this.nama=nama;}
    public void setHarga(int harga){this.harga=harga;}
    public void klik(){
        if(Greenfoot.mouseClicked(this))
        {
            World w=getWorld();
            ((w1)w).getData().setPrint(nama,harga);
        }
    }
}
