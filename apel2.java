import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class apel2 extends Actor
{
    public void act()
    {
        // menggerakan apel
        setLocation(getX(), getY()+5);
        if(getY()==580)
        {
            setLocation(getX(), 20);
        }
        //penambahan objek suara, game over, permainan selesai
        apel2 b = (apel2)getOneIntersectingObject(apel2.class);
        if(b!=null){
            getWorld().removeObject(b);
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
