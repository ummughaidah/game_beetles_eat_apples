import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class apel8 extends Actor
{
    public void act()
    {
        // menggerakan apel
        setLocation(getX(), getY()+1);
        if(getY()==580)
        {
            setLocation(getX(), 20);
        }
        //penambahan objek suara, game over, permainan selesai
        apel8 h = (apel8)getOneIntersectingObject(apel8.class);
        if(h!=null){
            getWorld().removeObject(h);
        }
        // Memeriksa apakah Kumbang sedang menyentuh Apel
        if (isTouching(kumbang.class))
        {
            // Mendapatkan referensi ke Kumbang yang menyentuh Apel
            kumbang kumbang = (kumbang) getOneIntersectingObject(kumbang.class);            
            // Memanggil metode eating() pada Kumbang
            kumbang.eating();
        }
    }
}
