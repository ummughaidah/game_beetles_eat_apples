import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class hijau2 extends Actor
{
    private int speed = 5; // Kecepatan pergerakan Apel Hijau
    public void act()
    {
        // Menggerakan Apel Hijau
        setLocation(getX(), getY() + speed);
        
        // Mendapatkan tinggi dunia
        int worldHeight = getWorld().getHeight();
        
        // Mengecek apakah Apel Hijau mencapai batas bawah dunia
        if (getY() >= worldHeight - 1)
        {
            // Mengatur posisi acak pada sumbu X dan Y
            int x = Greenfoot.getRandomNumber(getWorld().getWidth());
            int y = Greenfoot.getRandomNumber(worldHeight / 2);
            
            // Mengatur posisi Apel Hijau menjadi posisi acak
            setLocation(x, -y);
        }
    }
}
