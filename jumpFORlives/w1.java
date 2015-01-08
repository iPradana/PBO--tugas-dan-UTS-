import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class w1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class w1 extends World
{
    txt skor = new txt();
    txt highscore = new txt();
    txt play = new txt();
    
    Cross kar = new Cross();
    Main a = new Main(kar.img,kar.img2);
    
    Shop cd = new Shop("candy.png");
    
    End exit = new End("exit.png",true);
    End tryAgain = new End("try.png",false);
    
    /**
     * Constructor for objects of class w1.
     * 
     */
    public w1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600,600,1,false); 
        addObject(skor,300,300);
        skor.setPrint("0");
        addObject(a,30,200);

        duri_duri();
    }

    public void duri_duri(){
        Duri a1 = new Duri();
        Duri a2 = new Duri();
        Duri b1 = new Duri();
        Duri b2 = new Duri();

        addObject(a1,300,550);
        addObject(a2,-300,550);
        addObject(b1,300,50);
        b1.setRotation(180);
        addObject(b2,-300,50);
        b2.setRotation(180);

        addObject(highscore,300,580);
        highscore.setFontS(42);
        highscore.setFontC(Color.cyan);
        highscore.setHS();
        
        play.setFontS(72);
        play.setFontC(Color.black);
        play.setPrint("Click here to play");
        addObject(play,300,200);
        
    }
}
