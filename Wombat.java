import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Wombat, our hero
 * 
 * @author Tina
 * @version April 2026
 */
public class Wombat extends Actor
{
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-1);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(1);
        }
        
        eat();
    }
    
    /**
     * Eat the banana and spawn new banana if a banana is eaten.
     */public void eat()
    {
        if(isTouching(Banana.class))
        {
            removeTouching(Banana.class);
            MyWorld world = (MyWorld) getWorld();
            world.createBanana();
            world.increaseScore();
        }
    }
}
