import java.util.Random;          
import java.awt.*;
import javax.swing.*;

public class Illusion2 extends JFrame
{
    
    public Illusion2()
    {
        super ("Optical Illusion");
        setSize(600,600);
        setVisible(true);
        repaint();
    }
    public void paint(Graphics g)
    {
        
              super.paint(g);
                      
    }
           
            
        
   public static void main(String args[])
   {
        Illusion2 application = new Illusion2();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        
    
}