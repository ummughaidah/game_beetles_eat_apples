import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class apell9 extends Actor
{
    public void act()
    {
        // menggerakan apel
        setLocation(getX(), getY()+4);
        if(getY()==580)
        {
            setLocation(getX(), 20);
        }
        //penambahan objek suara, game over, permainan selesai
        apell9 i = (apell9)getOneIntersectingObject(apell9.class);
        if(i!=null){
            getWorld().removeObject(i);
        }
        // Memeriksa apakah Kumbang sedang menyentuh Apel
        if (isTouching(kumbang2.class))
        {
            // Mendapatkan referensi ke Kumbang yang menyentuh Apel
            kumbang2 kumbang2 = (kumbang2) getOneIntersectingObject(kumbang2.class);            
            // Memanggil metode eating() pada Kumbang
            kumbang2.eating();
        }
    }
}