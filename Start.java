import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Actor
{
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        start();
        checkKey();
    }
    
    public void start()
    {
        setImage(new GreenfootImage("Press Enter to play",50,Color.BLACK,
            Color.RED));
    }
    
    public void checkKey()
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new level_zero());
        }
    }
}
