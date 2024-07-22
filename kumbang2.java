import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class kumbang2 extends Actor
{
    private double size; // Ukuran Kumbang
    private int jumlahApelHijau;
    public kumbang2() {
        size = 1.0; // Ukuran awal Kumbang
        jumlahApelHijau = 0;
    }
    //mengatur posisi kumbang menghadap ke atas
    public void addedToWorld(World world)
    {
        // Mengatur posisi awal Kumbang
        int worldWidth = world.getWidth();
        int worldHeight = world.getHeight();
        // Mengubah arah pergerakan Kumbang ke atas
        setRotation(270);
    }
    //coding tindakan
    public void act()
    {
        //function memakan apel hijau
        checkCollision2();
        //memakan
        apell1 A1 = (apell1) getOneIntersectingObject(apell1.class);
        if (A1!=null)
        {
            score2 score2 = getscore();
            score2.nilai();
            getWorld().removeObject(A1);
            return;
        }
        apell2 B1 = (apell2) getOneIntersectingObject(apell2.class);
        if (B1!=null)
        {
            score2 score2 = getscore();
            score2.nilai();
            getWorld().removeObject(B1);
            return;
        }
        apell3 C1 = (apell3) getOneIntersectingObject(apell3.class);
        if (C1!=null)
        {
            score2 score2 = getscore();
            score2.nilai();
            getWorld().removeObject(C1);
            return;
        }
        apell4 D1 = (apell4) getOneIntersectingObject(apell4.class);
        if (D1!=null)
        {
            score2 score2 = getscore();
            score2.nilai();
            getWorld().removeObject(D1);
            return;
        }
        apell5 E1 = (apell5) getOneIntersectingObject(apell5.class);
        if (E1!=null)
        {
            score2 score2 = getscore();
            score2.nilai();
            getWorld().removeObject(E1);
            return;
        }
        apell6 F1 = (apell6) getOneIntersectingObject(apell6.class);
        if (F1!=null)
        {
            score2 score2 = getscore();
            score2.nilai();
            getWorld().removeObject(F1);
            return;
        }
        apell7 G1 = (apell7) getOneIntersectingObject(apell7.class);
        if (G1!=null)
        {
            score2 score2 = getscore();
            score2.nilai();
            getWorld().removeObject(G1);
            return;
        }
        apell8 H1 = (apell8) getOneIntersectingObject(apell8.class);
        if (H1!=null)
        {
            score2 score2 = getscore();
            score2.nilai();
            getWorld().removeObject(H1);
            return;
        }
        apell9 I1 = (apell9) getOneIntersectingObject(apell9.class);
        if (I1!=null)
        {
            score2 score2 = getscore();
            score2.nilai();
            getWorld().removeObject(I1);
            return;
        }
        apell10 J1 = (apell10) getOneIntersectingObject(apell10.class);
        if (J1!=null)
        {
            score2 score2 = getscore();
            score2.nilai();
            getWorld().removeObject(J1);
            return;
        }
        apell11 K1 = (apell11) getOneIntersectingObject(apell11.class);
        if (K1!=null)
        {
            score2 score2 = getscore();
            score2.nilai();
            getWorld().removeObject(K1);
            return;
        }
        apell12 L1 = (apell12) getOneIntersectingObject(apell12.class);
        if (L1!=null)
        {
            score2 score2 = getscore();
            score2.nilai();
            getWorld().removeObject(L1);
            return;
        }
        apell13 M1 = (apell13) getOneIntersectingObject(apell13.class);
        if (M1!=null)
        {
            score2 score2 = getscore();
            score2.nilai();
            getWorld().removeObject(M1);
            return;
        }
        apell14 N1 = (apell14) getOneIntersectingObject(apell14.class);
        if (N1!=null)
        {
            score2 score2 = getscore();
            score2.nilai();
            getWorld().removeObject(N1);
            return;
        }
        apell15 O1 = (apell15) getOneIntersectingObject(apell15.class);
        if (O1!=null)
        {
            score2 score2 = getscore();
            score2.nilai();
            getWorld().removeObject(O1);
            return;
        }
        //apel hijau
        bom1 P1 = (bom1) getOneIntersectingObject(bom1.class);
        if (P1!=null)
        {
            getWorld().removeObject(P1);
            Greenfoot.playSound("bom.mp3");
            gameOver();
            return;
        }
        bom2 Q1 = (bom2) getOneIntersectingObject(bom2.class);
        if (Q1!=null)
        {
            getWorld().removeObject(Q1);
            Greenfoot.playSound("bom.mp3");
            gameOver();
            return;
        }
        bom3 R1 = (bom3) getOneIntersectingObject(bom3.class);
        if (R1!=null)
        {
            getWorld().removeObject(R1);
            Greenfoot.playSound("bom.mp3");
            gameOver();
            return;
        }
        bom S1 = (bom) getOneIntersectingObject(bom.class);
        if (S1!=null)
        {
            getWorld().removeObject(S1);
            Greenfoot.playSound("bom.mp3");
            gameOver();
            return;
        }
        //navigasi kumbang2 ke kiri
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-4, getY());
        }
        //navigasi kumbang2 ke kanan
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+4, getY());
        }
        //navigasi kumbang2 ke atas
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-4);
        }
        //navigasi kumbang2 ke bawah
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+4);
        }
    }
    //mendapatkan score
    public score2 getscore()
    {
        return (score2) getWorld().getObjects(score2.class).iterator().next();
    }
    //memperbesar ukuran kumbang saat memakan apel merah
    public void eating()
    {
        // Menambah ukuran Kumbang
        size += 0.002;
        // Mengubah ukuran gambar Kumbang
        GreenfootImage image = getImage();
        int newWidth = (int) (image.getWidth() * size);
        int newHeight = (int) (image.getHeight() * size);
        image.scale(newWidth, newHeight);
    }
    //memakan apel hijau
    private void checkCollision2() {
        if (isTouching(hijau2.class)) {
            hijau2 apel = (hijau2) getOneIntersectingObject(hijau2.class);
            if (apel != null) {
                eat(apel);
            }
        }
    }
    //mengulang apel hijau
    private void eat(hijau2 apel) {
        getWorld().removeObject(apel);
        jumlahApelHijau++;
        Greenfoot.playSound("apelHijau.mp3");
        if (jumlahApelHijau >= 5) {
            gameOver();
        }
    }
    //gameOver
    private void gameOver() {
        Greenfoot.stop();
        setImage("selesai.png");
    }
}
