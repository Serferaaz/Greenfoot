import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Goku here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frieza extends Support
{
  
    /**
     * Act - do whatever the Goku wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage f1,f2,f3,f4,f5;
    
    public Frieza()
    {
     f1 = new GreenfootImage("Frieza.png");   
     f2 = new GreenfootImage("FriezaWalk.png");
     f3 = new GreenfootImage("FriezaWalkback.png");
     f4 = new GreenfootImage("FriezaBlock.png");
     f5 = new GreenfootImage("FriezaKick.png");
     setImage(f1);
    }
    public void act() 
    {
      mover();
    }    
    public void mover()
    {
        if (Greenfoot.isKeyDown("d")&& !contact(Goku.class) )
        {
            move();
            if(getImage() == f1)
            setImage(f2);
        }
        else
        {
            if (Greenfoot.isKeyDown("a"))
        {
            moveBackwards();
            if(getImage() == f1)
            setImage(f3);
        }
         else if (Greenfoot.isKeyDown("s"))
        {
                setImage(f4);
            }
        else if(Greenfoot.isKeyDown("q"))
        {
            setImage(f5);
        }
            
        else if (!Greenfoot.isKeyDown("d"))
        {
            setImage(f1);
        }
        else if (!Greenfoot.isKeyDown("a"))
        {
            setImage(f1);
        }
        else if (Greenfoot.isKeyDown("s"))
        {
                setImage(f4);
            }
        }
    }
}

