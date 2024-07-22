import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class bom2 extends Actor
{
    public void act()
    {
        // menggerakan bom
        setLocation(getX(), getY()+7);
        if(getY()==580)
        {
            setLocation(getX(), 20);
        }
        //penambahan objek suara, game over, permainan selesai
        bom2 p = (bom2)getOneIntersectingObject(bom2.class);
        if(p!=null){
            setImage("selesai.png");
            getWorld().removeObject(p);
            Greenfoot.stop();
        }
    }
}
