import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Music here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Music extends Actor
{
    GreenfootSound myMusic = new GreenfootSound("Dvnthony.mp3");
    boolean firstTurn = true;
   private GreenfootImage p1,p2;
   
    public Music()
    {
        p1 = new GreenfootImage("Pause.png");
        p2 = new GreenfootImage("Play.png");
        
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 475, image.getHeight() - 475);
        setImage(image);
    }
    /**
     * Act - do whatever the Music wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        if(firstTurn)
        {
            myMusic.playLoop();
            firstTurn = false;
        }
        if(Greenfoot.mouseClicked(this))
        {
            if(myMusic.isPlaying())
            {
                
                myMusic.pause();
                setImage("Play.png");
                GreenfootImage image = getImage();
                image.scale(image.getWidth() - 985, image.getHeight() - 985);
                setImage(image);
            } else
            {
                myMusic.playLoop();
                setImage("Pause.png");
                GreenfootImage image = getImage();
                image.scale(image.getWidth() - 475, image.getHeight() - 475);
                setImage(image);
            }
        }
    }    
}
