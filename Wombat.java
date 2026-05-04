import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Wombat, our hero
 * 
 * @author Tina
 * @version April 2026
 */
public class Wombat extends Actor
{
    GreenfootSound wombatSound = new GreenfootSound("Wombat.mp3");
    GreenfootImage[] idleRight = new GreenfootImage[5];
    GreenfootImage[] idleLeft = new GreenfootImage[5];
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    /**
     * Constructor
     */
    public Wombat()
    {
        for(int i = 0; i < idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/Wombat/Wombat" + i + ".png");
            idleRight[i].scale(100,100);
        }
        for(int i = 0; i < idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/Wombat/Wombat" + i + ".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(100,100);
        }
        
        animationTimer.mark();
        
        setImage(idleRight[0]);
    }
    int imageIndex = 0;
    public void animateWombat()
    {
        if(animationTimer.millisElapsed() < 100)
        {
            return;
        }
        animationTimer.mark();
        
        if(facing.equals("right"))
        {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        }else{
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
        
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-2);
            facing = "left";
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(2);
            facing = "right";
        }
        
        eat();
        animateWombat();
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
            wombatSound.play();
        }
    }
}
