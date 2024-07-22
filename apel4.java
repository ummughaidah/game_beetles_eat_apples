import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class apel4 extends Actor
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
        apel4 d = (apel4)getOneIntersectingObject(apel4.class);
        if(d!=null){
            getWorld().removeObject(d);
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
