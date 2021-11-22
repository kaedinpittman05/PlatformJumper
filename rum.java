import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rum extends Goal
{
    private int goal = 0;
    private int start = 0;
    private int level = 0;
    
    
    /**
     * Act - do whatever the Rum wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        goalCheck();
        
    }
    
    public void goalCheck()
    {
        if(isTouching(Pirate.class))
        {
            goal++;
            start++;
            newWorld();
        }
    }
    
    public void newWorld()
    {
        if(goal == 0 && start < 0)
        {
            Greenfoot.setWorld(new level_zero());
            
        }
        else if(goal == 1 && start == 1)
        {
            Greenfoot.setWorld(new level_one());
            goal++;
        }
        
    }
}
