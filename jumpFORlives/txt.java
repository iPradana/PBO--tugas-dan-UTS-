
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class txt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class txt extends Actor
{
    /**
     * Act - do whatever the txt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String print=" ";
    private int skor=0;
    private int font_s=180;
    private static int highscore;
    private Color font_c=Color.white;
    public boolean hs=false;
    public void act() 
    {
        // Add your action code here.
        setImage(new GreenfootImage(print,font_s,font_c,null));
        if(hs==false){diKlik();}
    }    
    
    public txt(){
        setImage(new GreenfootImage(print,font_s,font_c,null));
    }
    
    public void addSkor(){
        skor+=1;
        print = skor+"";
        if (skor>highscore){
            highscore=skor;
            ((w1)getWorld()).highscore.print="High Scores : "+highscore+"";
        }
        if(skor==5){((w1)getWorld()).setBackground("bg1.png");}
        if(skor==10){((w1)getWorld()).setBackground("bg22.png");}
        if(skor==15){((w1)getWorld()).setBackground("bg3.png");}
        if(skor==20){((w1)getWorld()).setBackground("bg4.png");}
    }
    
    public void setPrint(String s){
        print = s;
    }
    
    //setter
    public void setFontS(int s){font_s=s;}
    public void setFontC(Color c){font_c=c;}
    public void setHS(){
        if(hs==false){print="High Scores : "+highscore+"";}
        else{print="High \n Scores : "+highscore;}
    }
    //mouse click
    public void diKlik(){
        if(Greenfoot.mouseClicked(((w1)getWorld()).play)){
            ((w1)getWorld()).a.setPlay(true);
            ((w1)getWorld()).play.setLocation(-50,-50);
        }
    }
    
    //getter
    public int getSkor(){return skor;}
}