import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level_zero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level_zero extends MyWorld
{
    private Rum rum;
    /**
     * Constructor for objects of class level_zero.
     * 
     */
    public level_zero()
    {
        setBackground("beach.jpg");
        
        rum = new Rum();
        addObject (rum, 589,150);
        
         Pirate pirate = new Pirate();
         addObject(pirate, 40, 344);
         
         Fish fish = new Fish();
         addObject(fish, 599,255);
        Platform platform = new Platform();
         addObject(platform, 23,390);
         
         Platform platform1 = new Platform();
         addObject(platform1,70, 390);
         
        
         
         addObject(new Platform(), 156, 329);
         
         addObject(new Platform(), 198, 329);
         
         addObject(new Platform(), 275, 275);
         
         addObject(new Platform(), 320, 275);
         
         addObject(new Platform(), 401, 226);
         
         addObject(new Platform(), 449, 226);
         
         addObject(new Platform(), 522, 184);
         
         addObject(new Platform(), 568, 184);
         
         addObject(new Platform(), 587, 184);
    }
}
