import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
         super(1000, 200, 1);
        addObject(new Frieza(), 100, 150);
        addObject(new Goku(), 850, 150);
        addObject(new Healthbar(),150, 20);
        addObject(new Healthbar2(),850, 20);
        addObject(new Music(), 500, 20);
    }
}
