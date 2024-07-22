import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class apell14 extends Actor
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
        apell14 n = (apell14)getOneIntersectingObject(apell14.class);
        if(n!=null){
            getWorld().removeObject(n);
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
