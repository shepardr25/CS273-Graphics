/** This program draws concentric Boxes
 *   @author 
 */

// Import a couple of library-packages
import java.awt.*;
import javax.swing.*;

/** class Boxes
 *
 * The important thing that we need to do in this class is finish the
 * 'paint' method.  
 */
public class Boxes extends Canvas
{

    /** the "paint" method, that specifies what to draw on the screen
     * 
     * This method needs to be updated
     */
    public void paint(Graphics g)
    {
        //This line is important, don't remove it!
        super.paint(g);
        
        //Don't remove until AFTER you finish drawing your boxes.
        CoordinateSystem coordSystem = new CoordinateSystem();
        // Use the CoordinateSystem class to draw axes and grid
        coordSystem.paint(g); 
        
        /* EXPLANATION of the Grid Scale:
            - Grid markers are spaced every 50 pixels.
            - Both the X and Y axes are from 100 to 500 pixels.
            - The origin at the top-left (50, 50).
        */
       
        //These statements draw some boxes, but they are not the boxes you want.
        //Replace them with the correct code.
         g.setColor(Color.BLUE);  // Outer box
        g.fillRect(50, 50, 400, 400);

        g.setColor(Color.RED);  // Middle box
        g.fillRect(100, 100, 300, 300);

        g.setColor(Color.GREEN);  // Inner box
        g.fillRect(150, 150, 200, 200); 
    }//paint

    /**
     * main
     *
     * All Java programs start with a method named main.  This class' main
     * method creates the window to display your Java drawing.
     *
     * IMPORTANT:  DO NOT MODIFY THIS METHOD
     */
    public static void main(String[] args)
    {
        //Create a window for this program
        JFrame myFrame = new JFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(600,600);
 
        //Put an instance of this class in the window frame
        Boxes myContent = new Boxes();
        myContent.setBackground(Color.gray.brighter()); // set background color
        myFrame.getContentPane().add(myContent);
        
        // display the frame
        myFrame.setVisible(true);
        
    }//main


    
}//class Boxes
