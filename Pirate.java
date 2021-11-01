import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pirate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pirate extends Actor
{
    private int speed = 5;
    private int vSpeed = 0;
    private int acceleration = 1;
    private int jumpStrength= 15;
   
    /**
     * Act - do whatever the Duke wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeys();
        checkFall();
        touchingCrab();
        water();
    }
    
    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            moveRight();
        }
        
        if (Greenfoot.isKeyDown("left"))
        {
            moveLeft();
        } 
        
        if(Greenfoot.isKeyDown("space") && onGround())
        {
            jump();
        }
    }
    
    public void moveRight()
    {
        setLocation (getX() + speed, getY());
    }
    
    public void moveLeft()
    {
        setLocation (getX() - speed, getY());
    }
    
    public void fall()
    {
        setLocation (getX() , getY() + vSpeed);
        vSpeed += acceleration;
    }
    
    public boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0,getImage().getHeight()/2,Platform.class);
        
        return under != null;
    }
    
   
    
    public void checkFall()
    {
        if(onGround())
        {
            vSpeed=0;
        }
        else
        {
            fall();
        }
    }
    
    public void jump()
    {
        vSpeed= -jumpStrength;
        fall();
    }
    
    public void touchingCrab()
    {
        if(isTouching(Crab.class))
        {
            setLocation(40,344);
        }
    }
    
    public void water()
    {
        if(getY() >= getWorld().getHeight()-1)
        {
            setLocation(40,344);
        }
    }
}
