import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Goku here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Goku extends Support
{
  
    /**
     * Act - do whatever the Goku wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage g1, g2, g3, g4, g5, g6, g7, g8, g9, g10;
    
    public Goku()
    {
     g1 = new GreenfootImage("Goku.png");   
     g2 = new GreenfootImage("GokuWalk5.png");
     g3 = new GreenfootImage("GokuWalk3.png");
     g4 = new GreenfootImage("GokuWalk4.png");
     g5 = new GreenfootImage("GokuWalkback5.png");
     g6 = new GreenfootImage("GokuWalkback3.png");
     g7 = new GreenfootImage("GokuWalkback4.png");
     g8 = new GreenfootImage("GokuPunch.png");
     g9 = new GreenfootImage("GokuPunchback.png");
     g10 = new GreenfootImage("GokuBlockback.png");
     setImage(g1);
    }
    public void act() 
    {
      mover();
    }    
    public void mover()
    {
        if (Greenfoot.isKeyDown("right") )
        {
            move();
            if(getImage() == g1)
            setImage(g5);
            else if (getImage() == g5)
            setImage(g6);
            else if (getImage() == g6)
            setImage(g7);
            else if (getImage() == g7)
            setImage(g6);
        }
        else
        {
            if (Greenfoot.isKeyDown("left")&& !contact(Frieza.class))
        {
            moveBackwards();
            if(getImage() == g1)
            setImage(g2);
            else if (getImage() == g2)
            setImage(g3);
            else if (getImage() == g3)
            setImage(g4);
            else if (getImage() == g4)
            setImage(g3);
        }
        else if (Greenfoot.isKeyDown("m"))
            {
                setImage(g9);
            }
        else if (Greenfoot.isKeyDown("down"))
        {
            setImage(g10);
        }
        else if (!Greenfoot.isKeyDown("right"))
        {
            setImage(g1);
        }
        else if (!Greenfoot.isKeyDown("left"))
        {
            setImage(g1);
        }
        }
    }
}
