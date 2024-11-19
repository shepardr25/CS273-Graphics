# CS273-Graphics
Writing Sample assignment: Rewritten Graphics Lab 

**Justification for Design Decisions**

The changes I made were driven by the need to improve the understanding of the coordinate system and the positioning of objects on the canvas. Here’s why I made each modification:

- Added the Coordinate System Class (`CoordinateSystem.java`):
  - Justification: I added a dedicated `CoordinateSystem` class to display a grid and coordinate axes in the program. This addition helps students and users better visualize the positioning of graphical objects on the canvas. By clearly displaying the origin and grid markers every 50 pixels, the user can see how their shapes align with the coordinate system, which helps in avoiding confusion when positioning objects. The X and Y axes are clearly marked, and grid lines at intervals provide a visual structure for where objects can be placed. The use of a class means that students have the potential to implement the class in other projects like their Triangle.java file or thier House.java file.
  
- Modified the `Boxes.java` Class:
  - Justification: I integrated the `CoordinateSystem` class into the `Boxes.java` file by calling its `paint()` method to ensure the coordinate system is drawn before the boxes. This allows users to understand the layout of the boxes relative to the coordinate grid. As the student works on this class, they can see the positioning and size of the boxes being adjusted within the grid, making it easier to visualize. I applied the CoordinateSystem.java class to Boxes.java because this is the first checkpoint they will be working on, allowing them to have a firm foundational understanding as they move through the lab. Lastly, I wrote bullet comments within the code describing the coordinate system and the layering of the shapes. These comments provide clarity to my intent while still allowing the students to experiment with the code.

**Context of the Changes**

- Coordinate System Implementation:
  - Context: In the context of the lab’s goal of drawing graphics using coordinate points, understanding the coordinate system in this programming language is crucial for determining where objects are placed on the screen. The `CoordinateSystem` class allows users to see exactly where the origin is (at the top-left corner), and where each grid line falls. The `Boxes.java` class is the starting checkpoint of the lab where students will be first exposed to working with a new coordinate system. At this stage they need to have a clear understanding of the coordinate system versus the rest of the lab where other learning objectives are more advanced than understanding the coordinate layout.
- Box Positioning and Drawing Order:
  - Context: The lab requires students to understand how to position and layer graphical objects. By reading the comments describing the importance of the boxes, they can potentially understand how the new object will cover up previous ones. This ensures that when complete the students will understand how the inner boxes are fully visible and that the user can see the layering effect.


**Importance of the Changes**

The changes are important for the following reasons:

- Improved Understanding of the Coordinate System:
  - Importance: The addition of the coordinate grid makes the program more intuitive for students learning Java graphics. It visually represents the coordinate axes, helping them better understand how objects are positioned in relation to each other. This is especially important for students who are new to programming or working with graphics, as it helps reduce confusion around coordinate-based drawing and alignment.
- Improved Understanding of Layering Graphical Objects:
  - Importance: Understanding the drawing order is crucial when working with graphics. By clearly writing comments describing how the boxes are layered, I showed students how later drawings (like the red, blue, and green boxes) can cover earlier ones, which is a fundamental concept in many graphical applications. This teaches students the importance of drawing order when building more complex graphical user interfaces or games.
- Enhanced User Experience and Visual Clarity:
  - Importance: By predetermining a simple 50 pixels jump per tick mark, it makes it easy for students to determine the size of the boxes being layered. The understanding of size will assist in understanding the correct order and relative to the coordinate grid. They can see the direct relationship between the grid and the shapes, which enhances the learning experience. This change ensures that future lessons involving object placement and graphical manipulation will build on this foundation.

**Conclusion**

In summary, the modifications I made to the `CoordinateSystem` and `Boxes` classes are designed to improve the understanding of the coordinate system and the positioning of objects. These changes not only help clarify the relationship between the grid and the objects but also provide a better foundation for students to work with graphical elements in Java. The use of a grid to draw shapes demonstrates key concepts like coordinate-based drawing, drawing order, and spatial understanding in graphics programming.
