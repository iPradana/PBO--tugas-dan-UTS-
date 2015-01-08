import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class w0 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class w0 extends World
{
    Menu select = new Menu();
    Menu m1 = new Menu(1);
    Menu m2 = new Menu(2);
    Menu m3 = new Menu(3);
    htp h = new htp();
    Shop s = new Shop();
    txt highscore = new txt();

    Shop L1 = new Shop("lock.png");
    Shop L2 = new Shop("lock.png");
    Shop L3 = new Shop("lock.png");
    Shop L4 = new Shop("lock.png");
    Shop L5 = new Shop("lock.png");
    Shop L6 = new Shop("lock.png");

    Shop C1 = new Shop("K011.png");
    Shop C2 = new Shop("K021.png");
    Shop C3 = new Shop("K031.png");
    Shop C4 = new Shop("K041.png");
    Shop C5 = new Shop("K051.png");
    Shop C6 = new Shop("K061.png");

    txt t2 = new txt();
    txt t3 = new txt();
    txt t4 = new txt();
    txt t5 = new txt();
    txt t6 = new txt();

    Shop Teks = new Shop("Click the locked \n fish to buy",36,new Color(153,255,255),null);

    Play next = new Play("pil.png",1);
    Play prev = new Play("pil.png",2);
    Play go = new Play("go.png",3);
    Play p = new Play();
    Play t = new Play("Choose your character");

    Cross kar = new Cross();

    GreenfootSound soundst = new GreenfootSound("theme.mp3");
    /**
     * Constructor for objects of class w0.
     * 
     */
    public w0()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1,false); 
        prepare();
    }

    public void act(){
        soundst.playLoop();
    }

    public void prepare(){
        addObject(select,130,230);
        addObject(m1,130,230);
        addObject(m2,130,300);
        addObject(m3,130,370);
        addObject(h,1,-600);
        addObject(s,125,50);

        addObject(highscore,125,100);
        highscore.setFontS(32);
        highscore.setFontC(new Color(153,255,255));
        highscore.hs=true;
        highscore.setHS();

        addObject(C1,-100,1);
        addObject(C2,-100,1);
        addObject(C3,-100,1);
        addObject(C4,-100,1);
        addObject(C5,-100,1);
        addObject(C6,-100,1);

        addObject(L1,-100,1);
        addObject(L2,-100,1);
        addObject(L3,-100,1);
        addObject(L4,-100,1);
        addObject(L5,-100,1);
        addObject(L6,-100,1);

        addObject(Teks,-200,1);

        addObject(t2,-100,1); t2.setPrint("5"); t2.hs=true; t2.setFontS(28);
        addObject(t3,-100,1); t3.setPrint("10"); t3.hs=true; t3.setFontS(28);
        addObject(t4,-100,1); t4.setPrint("20"); t4.hs=true; t4.setFontS(28);
        addObject(t5,-100,1); t5.setPrint("40"); t5.hs=true; t5.setFontS(28);
        addObject(t6,-100,1); t6.setPrint("80"); t6.hs=true; t6.setFontS(28);

        addObject(next,-100,1);
        addObject(prev,-100,1);
        addObject(go,-200,1);
        addObject(p,-100,1);
        addObject(t,-200,1);

        if(s.k2==true){s.data[1]=1;}else if(s.k2==false){s.data[1]=0;}
        if(s.k3==true){s.data[2]=1;}else if(s.k3==false){s.data[2]=0;}
        if(s.k4==true){s.data[3]=1;}else if(s.k4==false){s.data[3]=0;}
        if(s.k5==true){s.data[4]=1;}else if(s.k5==false){s.data[4]=0;}
        if(s.k6==true){s.data[5]=1;}else if(s.k6==false){s.data[5]=0;}
    }
}
