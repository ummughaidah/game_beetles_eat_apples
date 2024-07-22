import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class latar extends World
{
    private int jumlahApelHijau;
    
    public latar()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1150, 600, 1);
        Greenfoot.playSound("soundGame.mp3");
        ViewActor();
        jumlahApelHijau = 0;
        prepare();
    }
    private void ViewActor(){
        addObject(new kumbang (), 600, 560);
        addObject(new apel1 (), 30, 20);
        addObject(new apel2 (), 90, 20);
        addObject(new apel3 (), 150, 20);
        addObject(new apel4 (), 270, 20);
        addObject(new apel5 (), 330, 20);
        addObject(new apel6 (), 390, 20);
        addObject(new apel7 (), 510, 20);
        addObject(new apel8 (), 570, 20);
        addObject(new apel9 (), 630, 20);
        addObject(new apel10 (), 750, 20);
        addObject(new apel11 (), 810, 20);
        addObject(new apel12 (), 870, 20);
        addObject(new apel13 (), 990, 20);
        addObject(new apel14 (), 1050, 20);
        addObject(new apel15 (), 1110, 20);
        score score = new score();
        addObject(score, 80, 580);
    }
    private void prepare() {
        // Membuat dan menempatkan ApelHijau di dunia
        while (jumlahApelHijau < 5) {
            hijau1 apel = new hijau1();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(apel, x, y);
            jumlahApelHijau++;
        }
    }
}
