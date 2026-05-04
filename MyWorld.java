import greenfoot.*;
/**
 * The World our hero lives in.
 * 
 * @author Tina
 * @version April 2026
 */
public class MyWorld extends World {
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    
    public MyWorld() {
        super(600, 400, 1, false);
        
        Wombat wombat = new Wombat();
        addObject(wombat, 300, 300);
        
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 300, 50);
        
        createBanana();
    }
    
    /*
     * End the game and draw 'GameOver'
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    /*
     * increase scroe
     */
    public void increaseScore()
    {
        score ++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0)
        {
            level +=1;
        }
    }
    public void createBanana()
    {
        Banana banana = new Banana();
        banana.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(banana, x , y);
    }
}
