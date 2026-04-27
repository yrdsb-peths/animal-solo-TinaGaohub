import greenfoot.*;
/**
 * The World
 * 
 * @author Tina
 * @version April 2026
 */

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Wombat wombat = new Wombat();
        addObject(wombat, 300, 200);
        
        createBanana();
    }
    
    public void createBanana()
    {
        Banana banana = new Banana();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(banana, x , y);
    }
}
