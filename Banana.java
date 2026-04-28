import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for our wombat.
 * 
 * @author Tina
 * @version April 2026
 */
public class Banana extends Actor
{
    
    public void act()
    {
        setLocation(getX(), getY()+2);
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
}
