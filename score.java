import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color.*;

public class score extends Actor
{
    private int value = 0;
    private int target = 0;
    private String text;
    private int stringLength;
    int point = 0;
    
    public score()
    {
        tambah();
    }
    //function nilai
    public void nilai ()
    {
        point++;
        tambah();
        if (point==15)
        {
            Greenfoot.setWorld(new latar2());
            setLocation(600, 400);
        }
    }
    //function membuat tampilan score
    public void tambah() {
    GreenfootImage nilai = new GreenfootImage
    ("Score : " + point, 32, Color.WHITE, Color.BLACK);
    setImage(nilai);
}
}
