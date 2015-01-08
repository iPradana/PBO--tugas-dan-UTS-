import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends Actor
{
    /**
     * Act - do whatever the Menu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String gambar;
    private int gbrV;
    private boolean pil=false;
    private int slot=1;
    public void act() 
    {
        // Add your action code here.
        setImage(gambar);
        if(pil==false){
            cekKlik();
        }
        if(pil==true){
            cekPindah();
            move();
        }
    }    

    public Menu(int gbr){
        if(gbr==1){gambar="play.png";gbrV=1;}
        else if(gbr==2){gambar="shop.png";gbrV=2;}
        else{gambar="help.png";gbrV=3;}
        setImage(gambar);
    }

    public Menu(){
        gambar="select.png";
        setImage(gambar);
        pil=true;
    }

    public void cekPindah(){
        if(Greenfoot.isKeyDown("down")){
            if(slot<3){slot+=1;}
            else{slot=1;}
            Greenfoot.delay(10);
            Greenfoot.delay(0);
        }
        if(Greenfoot.isKeyDown("up")){
            if(slot>1){slot-=1;}
            else{slot=3;}
            Greenfoot.delay(10);
            Greenfoot.delay(0);
        }
    }

    public void move(){
        if(slot==1){setLocation(130,230);}
        else if(slot==2){setLocation(130,300);}
        else{setLocation(130,370);}
    }

    public void setSlot(int slot){this.slot=slot;}

    public int getSlot() {return slot;}

    public void cekKlik(){
        if(Greenfoot.mouseClicked(this)){
            ((w0)getWorld()).select.setSlot(gbrV);
        }
    }
}
