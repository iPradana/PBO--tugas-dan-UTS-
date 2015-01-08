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
    public Data data;
    public Masukkan masukkan;
    public Amount amount;
    public Data total;
    public Lewat lewat;
    /**
     * Constructor for objects of class w1.
     * 
     */
    public w1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {

        item kreg = new item();
        kreg.setImg("kebab-regular.png");
        kreg.setNama("Kebab regular");
        kreg.setHarga(10000);
        addObject(kreg, 100, 330);
        
        item ks = new item();
        ks.setImg("sandwich_kebab.png");
        ks.setNama("Sandwich kebab");
        ks.setHarga(12000);
        addObject(ks, 290, 330);
        
        item ham = new item();
        ham.setImg("hamburger.png");
        ham.setNama("Hamburger");
        ham.setHarga(8000);
        addObject(ham, 480, 330);
        
        item kt = new item();
        kt.setImg("kentang-goreng.png");
        kt.setNama("Kentang goreng");
        kt.setHarga(6000);
        addObject(kt, 100, 510);
        
        item sd = new item();
        sd.setImg("soda.png");
        sd.setNama("Soda");
        sd.setHarga(5000);
        addObject(sd, 290, 510);
        
        item air = new item();
        air.setImg("air-mineral.png");
        air.setNama("Air mineral");
        air.setHarga(3000);
        addObject(air, 480, 510);
        
        data = new Data();
        addObject(data,200,130);
        masukkan = new Masukkan();
        addObject(masukkan, 525, 168);
        amount = new Amount();
        addObject(amount, 525,85);
        Plus plus = new Plus();
        addObject(plus, 425,85);
        Min min = new Min();
        addObject(min, 425,168);
        total = new Data();
        addObject(total,690,350);
        total.warna=Color.cyan;
        Hitung hitung = new Hitung();
        addObject(hitung, 699, 516);
        
        data.ttl=0;

        lewat = new Lewat();
        addObject(lewat, 0, 17);
    } 
    
    public Data getData(){return data;}
    public Amount getAmount(){return amount;}
    public Data getTotal(){return total;}
}
