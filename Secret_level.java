import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Secret_level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Secret_level extends MyWorld
{

    /**
     * Constructor for objects of class Secret_level.
     * 
     */
    public Secret_level()
    {
        setBackground("beach.jpg");
        
        addObject(new Talking(),521,272);
        
        addObject(new Shiggins(),571,312);
        
        Pirate pirate = new Pirate();
         addObject(pirate, 40, 344);
         
        Platform platform = new Platform();
         addObject(platform, 23,390);
         
        Platform platform1 = new Platform();
         addObject(platform1,70, 390);
         
         addObject(new Platform(), 115,390);
         
         addObject(new Platform(), 161,390);
         
         addObject(new Platform(), 209,390);
         
         addObject(new Platform(), 253,390);
         
         addObject(new Platform(), 299,390);
         
         addObject(new Platform(), 347,390);
         
         addObject(new Platform(), 392,390);
         
         addObject(new Platform(), 440,390);
         
         addObject(new Platform(), 486,390);
         
         addObject(new Platform(), 533,390);
         
         addObject(new Platform(), 581,390);
    }
}