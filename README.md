# CS273-Graphics
Writing Sample assignment: Rewritten Graphics Lab 

**Justification for Design Decisions**

The changes I made were driven by the need to improve the understanding of the coordinate system and the positioning of objects on the canvas. Here’s why I made each modification:

- Added the Coordinate System Class (`CoordinateSystem.java`):
  - Justification: I added a dedicated `CoordinateSystem` class to display a grid and coordinate axes in the program. This addition helps students and users better visualize the positioning of graphical objects on the canvas. By clearly displaying the origin and grid markers every 50 pixels, the user can see how their shapes align with the coordinate system, which helps in avoiding confusion when positioning objects. The X and Y axes are clearly marked, and grid lines at intervals provide a visual structure for where objects can be placed.
  
- Modified the `Boxes.java` Class:
  - Justification: I integrated the `CoordinateSystem` class into the `Boxes.java` file by calling its `paint()` method to ensure the coordinate system is drawn before the boxes. This allows users to understand the layout of the boxes relative to the coordinate grid. The positioning and size of the boxes were adjusted so they fit within the grid, making them easier to visualize. The boxes are drawn in the correct order: blue for the outermost box, red for the middle box, and green for the innermost box. This layering approach ensures that each box is visible without being obscured by the others.

**Context of the Changes**

- Coordinate System Implementation:
  - Context: In the context of the lab’s goal of drawing concentric boxes, understanding the coordinate system is crucial for determining where objects are placed on the screen. The `CoordinateSystem` class allows users to see exactly where the origin is (at the top-left corner), and where each grid line falls. This ensures that the boxes are correctly positioned on the screen and helps users understand how the grid aligns with the shapes they are drawing.

- Box Positioning and Drawing Order:
  - Context: The lab requires students to understand how to position and layer graphical objects. By adjusting the sizes and positions of the boxes, I demonstrated how objects should be drawn in sequence, with each new object potentially covering parts of the previous ones. This ensures that the inner boxes are fully visible and that the user can see the layering effect.

**Importance of the Changes**

The changes are important for the following reasons:

- Improved Understanding of the Coordinate System:
  - Importance: The addition of the coordinate grid makes the program more intuitive for students learning Java graphics. It visually represents the coordinate axes, helping them better understand how objects are positioned in relation to each other. This is especially important for students who are new to programming or working with graphics, as it helps reduce confusion around coordinate-based drawing and alignment.

- Enhanced User Experience and Visual Clarity:
  - Importance: By modifying the `Boxes.java` class to display the boxes in the correct order and relative to the coordinate grid, users will have a clearer understanding of how drawing works in Java. They can see the direct relationship between the grid and the shapes, which enhances the learning experience. This change ensures that future lessons involving object placement and graphical manipulation will build on this foundation.

- Effective Use of Drawing Order:
  - Importance: Understanding the drawing order is crucial when working with graphics. By clearly demonstrating how the boxes are layered, I showed students how later drawings (like the red and green boxes) can cover earlier ones, which is a fundamental concept in many graphical applications. This teaches students the importance of drawing order when building more complex graphical user interfaces or games.

**Conclusion**

In summary, the modifications I made to the `CoordinateSystem` and `Boxes` classes are designed to improve the understanding of the coordinate system and the positioning of objects. These changes not only help clarify the relationship between the grid and the objects but also provide a better foundation for students to work with graphical elements in Java. The use of a grid and visible layers of shapes demonstrates key concepts like coordinate-based drawing, drawing order, and spatial understanding in graphics programming.
