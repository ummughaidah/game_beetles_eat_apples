import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color.*;

public class score2 extends Actor
{

    private int value = 0;
    private int target = 0;
    private String text;
    private int stringLength;
    int point = 0;
    
    public score2()
    {
        tambah();
    }
    public void nilai ()
    {
        point++;
        tambah();
        if (point==15)
        {
            //Greenfoot.setWorld(new latar2());
            setImage("winner.png");
            setLocation(600, 300);
            Greenfoot.playSound("soundwinner.mp3");
            Greenfoot.stop();
        }
    }
    public void tambah() {
    GreenfootImage nilai = new GreenfootImage
    ("Score : " + point, 32, Color.WHITE, Color.BLACK);
    setImage(nilai);
    }
}
