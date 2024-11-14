/**
 * CoordinateSystem draws a grid on the background of the graphics.
 * This shows the user where they are drawing their images.
 * The grid markers are drawn every 50 pixels along both the X and Y axes.
 * The X-axis grid markers are placed at 100, 150, 200, ..., 500 pixels.
 * The Y-axis grid markers are placed at 100, 150, 200, ..., 500 pixels.
 * These markers help visualize the coordinate system, with the origin (0, 0) at the top-left.
 * The grid helps to understand the positioning of objects on the canvas relative to the axes.
 *
 * @author Ruth Shepard
 * @version 11/12/2024
 */
import java.awt.*;
import javax.swing.*;

/** class CoordinateSystem
 * 
 * This class demonstrates the coordinate system (origin at top-left)
 * and is meant to be integrated into the Boxes class.
 */
public class CoordinateSystem extends Canvas
{
    public void paint(Graphics g)
    {
        // Draw the coordinate axes
        g.setColor(Color.BLACK);
        g.drawLine(50, 50, 500, 50);  // X-axis
        g.drawLine(50, 50, 50, 500);  // Y-axis
        
        // Label the axes
        g.drawString("X", 510, 50);
        g.drawString("Y", 50, 510);
        
        // Draw the coordinate grid
        g.setColor(Color.LIGHT_GRAY);
        for (int x = 100; x <= 500; x += 50) {
            g.drawLine(x, 50, x, 500);  // Vertical grid lines
        }
        for (int y = 100; y <= 500; y += 50) {
            g.drawLine(50, y, 500, y);  // Horizontal grid lines
        }
    }
}
