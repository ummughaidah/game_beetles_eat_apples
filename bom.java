import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class bom extends Actor
{
    public void act()
    {
        // menggerakan bom
        setLocation(getX(), getY()+5);
        if(getY()==580)
        {
            setLocation(getX(), 20);
        }
        //penambahan objek suara, game over, permainan selesai
        bom3 p = (bom3)getOneIntersectingObject(bom3.class);
        if(p!=null){
            setImage("selesai.png");
            getWorld().removeObject(p);
            Greenfoot.stop();
        }
    }
}
