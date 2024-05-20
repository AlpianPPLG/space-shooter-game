import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor {
    private static final int SPEED = 4;
    private static final int FIRE_RATE = 15; // Delay tembaknya
    private int fireDelay = 0;
    
    public void act() {
        checkKeyPress();
        checkFire();
    }    
    
    private void checkKeyPress() {
        if(Greenfoot.isKeyDown("W")){
            setLocation(getX(), getY() - SPEED);
        }
        if(Greenfoot.isKeyDown("S")) {
            setLocation(getX(), getY() + SPEED);
        }
        if(Greenfoot.isKeyDown("A")) {
            setLocation(getX() - SPEED, getY());
        }
        if(Greenfoot.isKeyDown("D")) {
            setLocation(getX() + SPEED, getY());
        }
        
       GreenfootImage image = getImage();  
        System.out.println("Width: "+image.getWidth()+"\nHeight: "+image.getHeight());
        image.scale(200, 200);
        setImage(image);
        
    }
    private void checkFire() {
        if(fireDelay > 0) {
            fireDelay--;
        }
        
        if(Greenfoot.isKeyDown("space") && fireDelay == 0) {
            fire();
            fireDelay = FIRE_RATE;
            
        }
    }
    
      private void fire() {
        bullet bullet = new bullet();
        getWorld().addObject(bullet, getX(), getY() ); // Menembak proyektil dari posisi player

    }   
}