import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class latar2 extends World
{
    private int jumlahApelHijau;
    
    public latar2()
    {    
        // Create a new world with 11500x600 cells with a cell size of 1x1 pixels.
        super(1150, 600, 1);
        ViewActor();
        jumlahApelHijau = 0;
        prepare();
    }
    private void ViewActor(){
        addObject(new kumbang2 (), 600, 560);
        addObject(new apell1 (), 30, 20);
        addObject(new apell2 (), 90, 20);
        addObject(new apell3 (), 150, 20);
        addObject(new bom1 (), 210, 20);
        addObject(new apell4 (), 270, 20);
        addObject(new apell5 (), 330, 20);
        addObject(new apell6 (), 390, 20);
        addObject(new bom2 (), 450, 20);
        addObject(new apell7 (), 510, 20);
        addObject(new apell8 (), 570, 20);
        addObject(new apell9 (), 630, 20);
        addObject(new bom3 (), 690, 20);
        addObject(new apell10 (), 750, 20);
        addObject(new apell11 (), 810, 20);
        addObject(new apell12 (), 870, 20);
        addObject(new bom (), 930, 20);
        addObject(new apell13 (), 990, 20);
        addObject(new apell14 (), 1050, 20);
        addObject(new apell15 (), 1110, 20);
        score2 score2 = new score2();
        addObject(score2, 80, 580);
    }
    private void prepare() {
        // Membuat dan menempatkan ApelHijau di dunia
        while (jumlahApelHijau < 5) {
            hijau2 apel = new hijau2();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(apel, x, y);
            jumlahApelHijau++;
        }
    }
}
