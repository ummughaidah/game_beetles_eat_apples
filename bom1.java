import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class bom1 extends Actor
{
    /**
     * Act - do whatever the bom1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // menggerakan bom
        setLocation(getX(), getY()+4);
        if(getY()==580)
        {
            setLocation(getX(), 20);
        }
        //penambahan objek suara, game over, permainan selesai
        bom1 p = (bom1)getOneIntersectingObject(bom1.class);
        if(p!=null){
            getWorld().removeObject(p);
            setImage("selesai.png");
            Greenfoot.stop();
        }
    }
}
