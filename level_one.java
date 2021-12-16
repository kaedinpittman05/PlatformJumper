import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level_one here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level_one extends MyWorld
{
    private Rum rum;
    private Keg keg;
    /**
     * Constructor for objects of class level_one.
     * 
     */
    public level_one()
    {
         
        setBackground("beach.jpg");
        
        Pirate pirate = new Pirate();
         addObject(pirate, 40, 344);
        
        keg = new Keg();
        addObject (keg, 9,154);
        
        addObject(new Portal(),548,311);
        
        addObject(new Platform(),546, 375);
         
        Platform platform = new Platform();
         addObject(platform, 23,390);
         
         Platform platform1 = new Platform();
         addObject(platform1,70, 390);
         
         addObject(new Fish(),588,221);
         
         Crab crab = new Crab();
         addObject(crab,210, 90);
         
         Bomb bomb = new Bomb();
         addObject(bomb,427,31);
         
         addObject(new Platform(), 355, 272);
         
         addObject(new Platform(), 501, 193);
         
         addObject(new Platform(), 214, 330);
         
         addObject(new Platform(), 261, 330);
         
         addObject(new Platform(), 179, 330);
                  
         addObject(new Platform(), 388, 272);
         
         addObject(new Platform(), 434, 272);
         
         addObject(new Platform(),581 ,193 );
         
         addObject(new Platform(),539 ,193 ); 
         
         addObject(new Platform(),435 ,123 ); 
         
         addObject(new Platform(),388 ,123 ); 
         
         addObject(new Platform(),23 ,187 );
         
         addObject(new Platform(),65 ,187);
         
          
          
         
         addObject(new Platform(),201 ,123 );
         
         addObject(new Platform(),247 ,123 ); 
         
         addObject(new Platform(),342 ,123 ); 
         
         addObject(new Platform(),295 ,123 );
         
         
         
         
         
         
         
         
    }
}
