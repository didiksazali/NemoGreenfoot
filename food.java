import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class food extends Actor
{
    /**
     * Act - do whatever the food wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int x=getX();
        int y=getY();
        setLocation(x-2,y);
        if(x==0){
            getWorld().removeObject(this);
        }
        if(Greenfoot.mouseMoved(null)){
            MouseInfo mouse=Greenfoot.getMouseInfo();
            //if(mouse.getY()>(y-7) && mouse.getY()<(y+7)){
                //getWorld().addObject(new bullet2(),getX(),getY());
                //Greenfoot.playSound("bullet2.wav");
            //}
        }
       Actor b = getOneObjectAtOffset(0 ,0, hero.class);
        if(b != null){
           // getWorld().addObject(new fire(),getX(),getY());
            ((sky)getWorld()).tambah10();
            //getWorld().removeObject(b);
            getWorld().removeObject(this);
            sky.gs=new GreenfootSound("eat.wav");
            sky.gs.play();
        }
        /*if (isTouching(hero.class))
        { 
           
             ((sky)getWorld()).tambah10();
             getWorld().removeObject(this);
            return;

        }*/
    }    
}
