import greenfoot.*;

/**
 * 
 */
public class sky extends World
{
    Counter counter = new Counter("Skor: ");
    static GreenfootSound gs=new GreenfootSound("eat.wav");
    /**
     * Constructor for objects of class bg.
     * 
     */
    public sky()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(854, 480, 1); 
        setPaintOrder(score.class, food.class, hero.class, enemy.class, Counter.class, bullet1.class);
        addObject(new food(),500,320);
        addObject(new hero(),50,220);
        addObject(new enemy(),785,320);
        addObject(counter,120,450);
    }
    
    
   
    
    public void act(){
        
        if(Greenfoot.getRandomNumber(100)<1){
            addObject(new food(),853,Greenfoot.getRandomNumber(479));
        }
        if(Greenfoot.getRandomNumber(80)<1){
            addObject(new enemy(),853,Greenfoot.getRandomNumber(479));
        }
        if(Greenfoot.isKeyDown("space")){
            Greenfoot.stop();
        }
    }
    public void tambah(){
        counter.add(20);
    }
    
     public void tambah10(){
        counter.add(10);
    }

    /**
     * Called when game is up. Stop running and display score.
     */
    public void selesai() 
    {
        addObject(new score(counter.getValue()), getWidth()/2, getHeight()/2);
        Greenfoot.stop();
    }
}