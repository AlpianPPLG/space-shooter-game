import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class suicide_drone extends Actor
{
    private int vx = 0;
    int framecounter;
    public suicide_drone(){
        
    }
    
    public suicide_drone(int v) {
        vx = v;
    }
    
    public void addedToWorld(World Latar) {
        setRotation(180);
    }
    
    public void move(){
        setLocation(getX()+vx,getY());
    }
    
    public void act()
    {   
        
        move();
        GreenfootImage image = getImage();  
        System.out.println("Width: "+image.getWidth()+"\nHeight: "+image.getHeight());
        image.scale(170, 170);
        setImage(image);
        
        checkCollision();
    }    
    private void checkCollision()
    {
        framecounter++;
        Actor bullet = getOneIntersectingObject(bullet.class);
        if (framecounter >=1000)
        {
            getWorld().removeObject(this);
        }
        else if (isTouching(bullet.class)){
            getWorld().removeObject(this);
        }
          if (Greenfoot.getRandomNumber(100) < 20) { // Misalnya, 5% kemungkinan perubahan arah setiap frame
            turn(Greenfoot.getRandomNumber(90) - 45); // Putar antara -45 dan 45 derajat
        }
        move(2); // Misalnya, kecepatan gerakan musuh adalah 2 piksel per frame
    }
    
public class Enemy extends Actor {
    // 
}

public class EnemySpawner extends Actor {
    private int spawnDelay = 10; // Adjust the delay according to your game's pace

    public void act() {
        if (Greenfoot.getRandomNumber(10) < 5) { // Adjust 1000 and 5 according to your spawn rate
            spawnEnemy();
        }
    }

    private void spawnEnemy() {
        // Randomly determine the spawn position
        int x = Greenfoot.getRandomNumber(getWorld().getWidth());
        int y = Greenfoot.getRandomNumber(getWorld().getHeight());
        
        // Create a new enemy and add it to the world
        Enemy enemy = new Enemy();
        getWorld().addObject(enemy, x, y);
        }
    }
}

