import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * @author Tina
 * @version May 2026
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Animal", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, 100);
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act()
    {
        //Start the game if user presses the space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Wombat wombat = new Wombat();
        addObject(wombat,480,85);
        Label label = new Label("Use \u2190 \u2192 to Move", 40);
        addObject(label,220,255);
        Label label2 = new Label("Press <space> to Start", 40);
        addObject(label2,250,330);
        label.setLocation(290,265);
        label2.setLocation(290,320);
        wombat.setLocation(290,185);
    }
}
