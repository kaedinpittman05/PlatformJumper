import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flying_fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flying_fish extends Actor
{
    private int dY=7;
    
    /**
     * Act - do whatever the flying_fish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        checkTurn();
    }
    
    public void checkTurn()
    {
        if(getY()<=0 || getY() >= getWorld().getHeight()-1)
        {
            setRotation(180);
            dY= -dY;
        }
        if(getY()<=0)
        {
            setRotation(0);
        }
        
    }
    
    public void move()
    {
        setLocation(getX(), getY()+dY );
    }
}
