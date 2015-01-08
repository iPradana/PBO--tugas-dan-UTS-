import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class w2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class w2 extends World
{
    public Teks out;
    public Teks h1;
    public Teks h2;
    public Teks h3;
    public Lewat lewat;
    public Data total;
    public Kalkulator hitung;
    /**
     * Constructor for objects of class w2.
     * 
     */
    public w2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        Kalkulator k1 = new Kalkulator();
        addObject(k1,150,285);
        Kalkulator k2 = new Kalkulator();
        addObject(k2,300,285);
        Kalkulator k3 = new Kalkulator();
        addObject(k3,450,285);
        Kalkulator k4 = new Kalkulator();
        addObject(k4,150,375);
        Kalkulator k5 = new Kalkulator();
        addObject(k5,300,375);
        Kalkulator k6 = new Kalkulator();
        addObject(k6,450,375);
        Kalkulator k7 = new Kalkulator();
        addObject(k7,150,465);
        Kalkulator k8 = new Kalkulator();
        addObject(k8,300,465);
        Kalkulator k9 = new Kalkulator();
        addObject(k9,450,465);
        Kalkulator k0 = new Kalkulator();
        addObject(k0,150,555);
        Kalkulator kc = new Kalkulator();
        addObject(kc,450,555);
        hitung = new Kalkulator();
        addObject(hitung,500,100);

        out = new Teks();
        addObject(out,300,130);

        h1 = new Teks();
        addObject(h1,700,250);
        h1.setFont(30);
        h1.setColor(Color.cyan);

        h2 = new Teks();
        addObject(h2,700,350);
        h2.setFont(30);
        h2.setColor(Color.cyan);
        
        k1.setImg("1.png");k1.setX(1);
        k2.setImg("2.png");k2.setX(2);
        k3.setImg("3.png");k3.setX(3);
        k4.setImg("4.png");k4.setX(4);
        k5.setImg("5.png");k5.setX(5);
        k6.setImg("6.png");k6.setX(6);
        k7.setImg("7.png");k7.setX(7);
        k8.setImg("8.png");k8.setX(8);
        k9.setImg("9.png");k9.setX(9);
        k0.setImg("0.png");k0.setX(0);
        kc.setImg("c.png");kc.setX(10);
        hitung.setImg("select.png");hitung.setX(11);

        Teks t1 = new Teks();
        addObject(t1,700,100);
        t1.setPrints("Harga Total");
        t1.setFont(30);
        
        Teks t2 = new Teks();
        addObject(t2,700,200);
        t2.setPrints("Uang bayar");
        t2.setFont(30);

        Teks t3 = new Teks();
        addObject(t3,700,300);
        t3.setPrints("Kembali");
        t3.setFont(30);
        
        lewat = new Lewat();
        addObject(lewat,10,17);
        
        total = new Data();
        addObject(total,700,150);
        total.print=total.getTtl()+"";
        total.setColor(Color.cyan);
        total.font(30);

        Exit e = new Exit();
        addObject(e,700,500);
    }

    public Teks getOut(){return out;}
}
