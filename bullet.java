import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bullet extends Player {
    
    private int speed = 5; // Kecepatan bullet
    private int width = 10; // Lebar hitbox bullet
    private int height = 10; // Tinggi hitbox bullet
    /**
     * Act - do whatever the bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        
        GreenfootImage image = getImage();  
        System.out.println("Width: "+image.getWidth()+"\nHeight: "+image.getHeight());
        image.scale(250, 250);
   
        setImage(image);
        
        move(30);
        if(isAtEdge()) {
            getWorld().removeObject(this); 
         }       
    }
}