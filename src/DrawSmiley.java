
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;



/**
 *
 * @author thiagomurphy
 */



public class DrawSmiley extends JPanel{
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        //draw the face
//        g.setColor(Color.black);
//        g.drawOval(10, 10, 200, 200);
        g.setColor(Color.yellow);
        g.fillOval(10, 10, 200, 200);
        
        //draw the eyes
        for(int i = 0; i < 10; i++){
            
            //left
            g.setColor(Color.magenta);
            g.fillOval(55, 65, 40 - 4, 40 - 4);
            g.setColor(Color.pink);
            g.fillOval(60, 70, 30 - 4, 30 - 4);
            g.setColor(Color.magenta);
            g.fillOval(65, 75, 20 - 4, 20 - 4);
            g.setColor(Color.pink);
            g.fillOval(70, 80, 10 - 4, 10 - 4);
        
            //right
            g.setColor(Color.blue);
            g.fillOval(135, 65, 40 - 4, 40 - 4);
            g.setColor(Color.green);
            g.fillOval(140, 70, 30 - 4, 30 - 4);
            g.setColor(Color.blue);
            g.fillOval(145, 75, 20 - 4, 20 - 4);
            g.setColor(Color.green);
            g.fillOval(150, 80, 10 - 4, 10 - 4);
            
        }// end for loop
        
        
        //draw the mouth
        g.setColor(Color.black);
        g.fillOval(50, 110, 120, 60);
        
        //"touch up" the mouth into a smile
        g.setColor(Color.yellow);
        g.fillRect(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);
        
    }//end paintComponent method
    
}//end class DrawSmiley
