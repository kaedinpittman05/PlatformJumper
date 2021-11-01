import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level_two here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level_two extends MyWorld
{

    /**
     * Constructor for objects of class level_two.
     * 
     */
    public level_two()
    {
        setBackground("beach.jpg");
        
        Pirate pirate = new Pirate();
        addObject(pirate,39,10);
        
        addObject(new Platform(),71 ,60 );
         
        addObject(new Platform(),23 ,60 );
        
        addObject(new Platform(),578 ,49 );   
        
        addObject(new Platform(),580,204 );  
        
        addObject(new Platform(),440,324 ); 
        
        addObject(new Platform(),315,257 ); 
        
        addObject(new Platform(),68,387 ); 
        
        addObject(new Platform(),70,270 ); 
        
        addObject(new Platform(),67,164 ); 
        
        addObject(new Platform(),22,164 ); 
        
        addObject(new Platform(),22,270 ); 
        
        addObject(new Platform(),22,387 ); 
        
        addObject(new Platform(),270,257 ); 
        
        addObject(new Platform(),394,324 ); 
        
        addObject(new Platform(),533,204 ); 
        
        addObject(new Platform(),426,160 ); 
        
        addObject(new Platform(),378,160 ); 
        
        addObject(new Platform(),531, 49); 
        
        addObject(new Platform(),578,387 ); 
        
        addObject(new Platform(),531,387 ); 
    }
}
