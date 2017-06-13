
import javax.swing.JFrame;



/**
 *
 * @author thiagomurphy
 */

public class DrawSmileyTest {
    
    public static void main (String[] args){
        
        DrawSmiley smiley = new DrawSmiley();
        
        JFrame app = new JFrame();
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(smiley);
        app.setSize(230, 250);
        app.setVisible(true);
        
    }//end main
    
}//end class DrawSmileyTest
