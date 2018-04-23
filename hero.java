import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class hero extends Actor
{
    /**
     * Act - do whatever the ps wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private sky pl;
    public void addedToWorld(World sky){
        pl=(sky)sky;
    }
    public void act() 
    {
        // Add your action code here.
        
        if(Greenfoot.mouseMoved(null)){
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation(mouse.getX(), mouse.getY());
        }
        if(Greenfoot.mouseClicked(null)) {
            pl.addObject(new bullet1(),getX()+getImage().getHeight(),getY());
            Greenfoot.playSound("shoot_buble.wav");
        }
        
        Actor a=getOneObjectAtOffset(0,0,enemy.class);
        if(a!=null){
           // getWorld().addObject(new fire(),getX(),getY());
            ((sky)getWorld()).selesai();
            getWorld().removeObject(a);
            getWorld().removeObject(this);
        }   
        
        
        
        
         
    }
}