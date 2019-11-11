import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Support here.
 * 
 * @author Jacob Schwartz 
 * @version 1.0
 */
public class Support extends Actor
{
public int lifeGoku = 0;
public int lifeFrieza = 0;
private int stage = 0;
private static final double WALKING_SPEED = 5.0;
    /**
     * Act - do whatever the Support wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    }   
    /**
     * Turn 'angle' degrees towards the right (clockwise).
     */
    public void turn(int angle)
    {
        setRotation(getRotation() + angle);
    }
    

    /**
     * Move forward in the current direction.
     */
    public void move()
    {
        double angle = Math.toRadians( getRotation() );
        int x = (int) Math.round(getX() + Math.cos(angle) * WALKING_SPEED);
        int y = (int) Math.round(getY() + Math.sin(angle) * WALKING_SPEED);
        
        setLocation(x, y);
    }
        /**
     * Move backwards in the current direction.
     */
    public void moveBackwards()
    {
        double angle = Math.toRadians( getRotation() );
        int x = (int) Math.round(getX() - Math.cos(angle) * WALKING_SPEED);
        int y = (int) Math.round(getY() - Math.sin(angle) * WALKING_SPEED);
        
        setLocation(x, y);
    }
        
    /**
     * Return true if we can see an object of class 'clss' right where we are. 
     * False if there is no such object here.
     */
    public boolean contact(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }
}
