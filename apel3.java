import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class apel3 extends Actor
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
        apel3 c = (apel3)getOneIntersectingObject(apel3.class);
        if(c!=null){
            getWorld().removeObject(c);
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