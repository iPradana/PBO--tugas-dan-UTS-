import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main extends Actor
{
    /**
     * Act - do whatever the Main wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int dy=0;
    private int dx=5;
    private int g=0;
    private int cr=300;
    private int cc=250;
    private int jumlahR=1;
    private boolean jalan=false;
    private boolean candy=false;
    
    private String k1;
    private String k2;

    public void act() 
    {
        // Add your action code here.
        if(jalan==true){
            move();
            setRotation(45);
            mati();
            if(isTouching(Cross.class)){candy=false;addC();}
        }
    }    
    
    public Main(String a,String b){
        k1=a;
        k2=b;
        setImage(k1);
    }
    
    public void addC(){
        ((w1)getWorld()).cd.candy++;
    }
    
    public void move(){
        Greenfoot.delay(1);
        if(g%2==0){dy+=1;}
        setLocation(getX()+dx,getY()+dy);
        if(Greenfoot.mouseClicked(getWorld()) || Greenfoot.isKeyDown("space")){dy=-8;g=-16;}
        g+=1;
        if(getX()<=19 || getX()>=581){
            GreenfootSound sounds = new GreenfootSound("skor.mp3");
            sounds.play();
            dx=dx*-1;
            cekCandy();
            if(dx<0){setImage(k2);}
            else{setImage(k1);}
            ((w1)getWorld()).skor.addSkor();
            if(((w1)getWorld()).skor.getSkor()%2==0){
                jumlahR++;
            }
            remove();
            generate();
        }
        Greenfoot.delay(0);
    }

    public void mati(){
        if(isTouching(Duri.class) || isTouching(Red.class)){
            //Greenfoot.setWorld(new w0());
            //Greenfoot.stop();
            jalan=false;
            GreenfootSound soundm = new GreenfootSound("mati.mp3");
            soundm.play();
            ((w1)getWorld()).addObject(((w1)getWorld()).exit,300,150);
            ((w1)getWorld()).addObject(((w1)getWorld()).tryAgain,300,450);
        }
    }

    //generator and remover
    public void generate(){
        cr=cr*-1;
        for(int i=0;i<=jumlahR;i++){
            ((w1)getWorld()).addObject(new Red(),300+cr,((1+(int)Greenfoot.getRandomNumber(9))*45)+80);
        }
        if(jumlahR>10){jumlahR=5;}
    }

    public void remove(){
        ((w1)getWorld()).removeObjects(((w1)getWorld()).getObjects(Red.class));
    }

    public void cekCandy(){
        if (candy==false){
            if(getX()>550){cc=-250;}
            else{cc=250;}
            ((w1)getWorld()).addObject(new Cross("candy.png"),300+cc,((1+(int)Greenfoot.getRandomNumber(9))*45)+80);
            candy=true;
        }
    }
    
    public void setPlay(boolean x){jalan=x;}
}
