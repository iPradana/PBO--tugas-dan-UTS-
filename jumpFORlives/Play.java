import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends Menu
{
    /**
     * Act - do whatever the Play wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static String img;
    private static String img2;
    private String gbr;
    private static int pilih=0;
    private int pn=0;
    private boolean karakter;

    public void act() 
    {
        // Add your action code here.
        if(pn>0 && pn<3){
            if(Greenfoot.mouseClicked(this)){cek();}
        }
        if(pn==3){
            if(Greenfoot.mouseClicked(this)){letsGO();}
            if(((w0)getWorld()).select.getSlot()==1){
                set();
            }
            else{remove();}
        }
    }    

    public Play(String gbr,int pn){
        this.gbr=gbr;
        setImage(gbr);
        if(pn==2){setRotation(180);}
        this.pn=pn;
    }

    public Play(){
        setImage("K011.png");
    }

    public Play(String x){
        setImage(new GreenfootImage(x,36,new Color(153,255,255),null));
    }

    public void cek(){
        karakter=false;
        ((w0)getWorld()).s.data[0]=1;
        if(pn==1){
            while(karakter==false){
                pilih++;
                if(pilih==6){pilih=0;karakter=true;}
                if(((w0)getWorld()).s.data[pilih]==1){
                    karakter=true;
                }
            }
        }
        else{
            while(karakter==false){
                pilih-=1;
                if(pilih==-1){pilih=5;}
                if(((w0)getWorld()).s.data[pilih]==1){
                    karakter=true;
                }
            }
        }
        if(pilih==0){((w0)getWorld()).p.setImage("K011.png");}
        if(pilih==1){((w0)getWorld()).p.setImage("K021.png");}
        if(pilih==2){((w0)getWorld()).p.setImage("K031.png");}
        if(pilih==3){((w0)getWorld()).p.setImage("K041.png");}
        if(pilih==4){((w0)getWorld()).p.setImage("K051.png");}
        if(pilih==5){((w0)getWorld()).p.setImage("K061.png");}
    }

    public void set(){
        ((w0)getWorld()).next.setLocation(500,300);
        ((w0)getWorld()).prev.setLocation(300,300);
        ((w0)getWorld()).go.setLocation(405,400);
        ((w0)getWorld()).p.setLocation(400,300);
        ((w0)getWorld()).t.setLocation(405,200);
    }

    public void setGbr(){
        if(pilih==0){
            ((w0)getWorld()).kar.img="K011.png";
            ((w0)getWorld()).kar.img2="K012.png";
        }            
        if(pilih==1){
            ((w0)getWorld()).kar.img="K021.png";
            ((w0)getWorld()).kar.img2="K022.png";
        }
        if(pilih==2){
            ((w0)getWorld()).kar.img="K031.png";
            ((w0)getWorld()).kar.img2="K032.png";
        }
        if(pilih==3){
            ((w0)getWorld()).kar.img="K041.png";
            ((w0)getWorld()).kar.img2="K042.png";
        }
        if(pilih==4){
            ((w0)getWorld()).kar.img="K051.png";
            ((w0)getWorld()).kar.img2="K052.png";
        }
        if(pilih==5){
            ((w0)getWorld()).kar.img="K061.png";
            ((w0)getWorld()).kar.img2="K062.png";
        }
    }

    public void remove(){
        ((w0)getWorld()).next.setLocation(-500,300);
        ((w0)getWorld()).prev.setLocation(-300,300);
        ((w0)getWorld()).go.setLocation(-300,300);
        ((w0)getWorld()).p.setLocation(-400,300);
        ((w0)getWorld()).t.setLocation(-400,300);
    }

    public void letsGO(){
        setGbr();
        ((w0)getWorld()).soundst.stop();
        GreenfootSound start = new GreenfootSound("start.mp3");
        start.play();
        Greenfoot.setWorld(new w1());
    }
}
