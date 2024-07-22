import greenfoot.*;

public class bom3 extends Actor
{
    public void act()
    {
        // menggerakan bom
        setLocation(getX(), getY()+2);
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
