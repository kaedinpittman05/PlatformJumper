import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class learn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class learn extends MyWorld
{

    /**
     * Constructor for objects of class learn.
     * 
     */
    public learn()
    {
        setBackground("beach.jpg");
        
        
         
         addObject(new Bottle(),571,275);
        
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
         
         addObject(new Bomb(),199,356);
        
        addObject(new Crab(),413,357);
        
        Pirate pirate = new Pirate();
         addObject(pirate, 40, 344);
    }
}
