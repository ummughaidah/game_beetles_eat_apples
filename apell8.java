import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class apell8 extends Actor
{
    public void act()
    {
        // menggerakan apel
        setLocation(getX(), getY()+2);
        if(getY()==580)
        {
            setLocation(getX(), 20);
        }
        //penambahan objek suara, game over, permainan selesai
        apell8 h = (apell8)getOneIntersectingObject(apell8.class);
        if(h!=null){
            getWorld().removeObject(h);
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
