/** This program draws a Triangle
 *   @author 
 */

// Import a couple of library-packages
import java.awt.*;
import javax.swing.*;

/** class Triangle
 *
 * The important thing that we need to do in this class is finish the
 * 'paint' method.  
 */
public class Triangle extends Canvas
{

    /** 
     * the "paint" method, that specifies what to draw on the screen
     */
    public void paint(Graphics g)
    {
        //This line is important, don't remove it!
        super.paint(g);

        //==>Replace this comment with your code<==
        
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
        Triangle myContent = new Triangle();
        myContent.setBackground(Color.gray.brighter());
        myFrame.getContentPane().add(myContent);
        
        //Display the frame
        myFrame.setVisible(true);
        
    }//main


    
}//class Triangle
