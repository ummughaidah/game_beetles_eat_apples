import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class kumbang extends Actor
{
    private double size; // Ukuran Kumbang
    private int jumlahApelHijau;
    
    public kumbang() {
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
        checkCollision();
        //memakan apel merah
        apel1 A = (apel1) getOneIntersectingObject(apel1.class);
        if (A!=null)
        {
            score score = getscore();
            score.nilai();
            getWorld().removeObject(A);
            return;
        }
        apel2 B = (apel2) getOneIntersectingObject(apel2.class);
        if (B!=null)
        {
            score score = getscore();
            score.nilai();
            getWorld().removeObject(B);
            return;
        }
        apel3 C = (apel3) getOneIntersectingObject(apel3.class);
        if (C!=null)
        {
            score score = getscore();
            score.nilai();
            getWorld().removeObject(C);            
            return;
        }
        apel4 D = (apel4) getOneIntersectingObject(apel4.class);
        if (D!=null)
        {
            score score = getscore();
            score.nilai();
            getWorld().removeObject(D);
            return;
        }
        apel5 E = (apel5) getOneIntersectingObject(apel5.class);
        if (E!=null)
        {
            score score = getscore();
            score.nilai();
            getWorld().removeObject(E);
            return;
        }
        apel6 F = (apel6) getOneIntersectingObject(apel6.class);
        if (F!=null)
        {
            score score = getscore();
            score.nilai();
            getWorld().removeObject(F);
            return;
        }
        apel7 G = (apel7) getOneIntersectingObject(apel7.class);
        if (G!=null)
        {
            score score = getscore();
            score.nilai();
            getWorld().removeObject(G);
            return;
        }
        apel8 H = (apel8) getOneIntersectingObject(apel8.class);
        if (H!=null)
        {
            score score = getscore();
            score.nilai();
            getWorld().removeObject(H);
            return;
        }
        apel9 I = (apel9) getOneIntersectingObject(apel9.class);
        if (I!=null)
        {
            score score = getscore();
            score.nilai();
            getWorld().removeObject(I);
            return;
        }
        apel10 J = (apel10) getOneIntersectingObject(apel10.class);
        if (J!=null)
        {
            score score = getscore();
            score.nilai();
            getWorld().removeObject(J);
            return;
        }
        apel11 K = (apel11) getOneIntersectingObject(apel11.class);
        if (K!=null)
        {
            score score = getscore();
            score.nilai();
            getWorld().removeObject(K);
            return;
        }
        apel12 L = (apel12) getOneIntersectingObject(apel12.class);
        if (L!=null)
        {
            score score = getscore();
            score.nilai();
            getWorld().removeObject(L);
            return;
        }
        apel13 M = (apel13) getOneIntersectingObject(apel13.class);
        if (M!=null)
        {
            score score = getscore();
            score.nilai();
            getWorld().removeObject(M);
            return;
        }
        apel14 N = (apel14) getOneIntersectingObject(apel14.class);
        if (N!=null)
        {
            score score = getscore();
            score.nilai();
            getWorld().removeObject(N);
            return;
        }
        apel15 O = (apel15) getOneIntersectingObject(apel15.class);
        if (O!=null)
        {
            score score = getscore();
            score.nilai();
            getWorld().removeObject(O);
            return;
        }
        //navigasi kumbang ke kiri
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-4, getY());
        }
        //navigasi kumbang ke kanan
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+4, getY());
        }
        //navigasi kumbang ke atas
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-4);
        }
        //navigasi kumbang ke bawah
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+4);
        }
    }
    //mendapatkan score
    public score getscore()
    {
        return (score) getWorld().getObjects(score.class).iterator().next();
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
    private void checkCollision() {
        if (isTouching(hijau1.class)) {
            hijau1 apel = (hijau1) getOneIntersectingObject(hijau1.class);
            if (apel != null) {
                eat(apel);
            }
        }
    }
    //mengulang apel hijau
    private void eat(hijau1 apel) {
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
