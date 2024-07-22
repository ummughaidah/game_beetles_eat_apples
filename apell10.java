import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class apell10 extends Actor
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
        apell10 j = (apell10)getOneIntersectingObject(apell10.class);
        if(j!=null){
            getWorld().removeObject(j);
        }
        // Memeriksa apakah Kumbang sedang menyentuh Apel
        if (isTouching(kumbang2.class))
        {
            // Mendapatkan referensi ke Kumbang yang menyentuh Apel
            kumbang2 kumbang2 = (kumbang2) getOneIntersectingObject(kumbang2.class);            
            // Memanggil metode eat() pada Kumbang
            kumbang2.eating();
        }
    }
}
