import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Latar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Latar extends World {
    /**
     * Constructor for objects of class Latar.
     * 
     */
    public Latar() { 
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 400, 1); 
        prepare();
    }
    private void prepare() {
        Kembali kembali = new Kembali();
        addObject(kembali,50,55);
        
        Player Player = new Player();
        addObject(Player,55,251);
        
        suicide_drone suicide_drone = new suicide_drone();
        addObject(suicide_drone, 800,251);
    }
    public class Dunia extends World {
    public Dunia() {
        super(1000, 400, 1);
        prepare();
    }

    private void prepare() {
        int jumlahMusuh = 10; // Jumlah musuh yang ingin Anda munculkan
        for (int i = 0; i < jumlahMusuh; i++) {
            addObject(new suicide_drone(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        }
    }
    
    public class Enemy extends Actor {
    // Implement behavior for the enemy
}

public class EnemySpawner extends Actor {
    private int spawnDelay = 10; // Adjust the delay according to your game's pace

    public void act() {
        if (Greenfoot.getRandomNumber(100) < 5) { // Adjust 1000 and 5 according to your spawn rate
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
}