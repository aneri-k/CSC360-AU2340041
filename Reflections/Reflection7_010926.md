# Class Reflection (1 September 2026)

## Topics

* Drawing a triangle using three coordinates
* Drawing circles using mouse input in JavaFX
* Connecting circles using arrows
* Checking whether a point is inside a circle
* Trees and their terminology
* Binary trees
* Binary search trees

## Notes

### Topic 1: Drawing a Triangle Using Coordinates

The lecture continued with drawing different shapes using JavaFX. We learned how to create a triangle when the coordinates of its three points or the equations of the three sides are given. The three points can be connected in sequence to form the three sides of the triangle.

We also discussed how the coordinates can be stored and passed to methods such as `strokePolygon()` to draw the triangle on a JavaFX `Canvas`. This helped me understand how the points and coordinates we learned earlier can be directly used to create shapes in a graphical application.

---

### Topic 2: Drawing Circles Using Mouse Input

We also worked with mouse input to draw circles on a JavaFX `Canvas`. A circle can be created when the user right-clicks on the canvas, with the position of the mouse click being used as the centre of the circle.

We learned that the coordinates provided while drawing an oval represent the top-left corner of its bounding box. Therefore, the radius needs to be subtracted from the mouse coordinates so that the circle is centred exactly where the user clicked.

This showed me how mouse events can be combined with graphics to make the application interactive.

---

### Topic 3: Connecting Circles with Arrows

Another part of the lecture focused on connecting two circles using arrows. Instead of drawing the arrow directly from the centre of one circle to the centre of another, we can calculate the points where the arrow should start and end so that it connects to the boundaries of the circles.

The direction between the two circles can be calculated using their coordinates. The radius of each circle is then used to determine the appropriate starting and ending points.

I found this useful because it combines coordinate calculations with graphical programming and makes the drawing look more accurate.

---

### Topic 4: Checking Whether a Point Is Inside a Circle

We also learned how to check whether a particular point lies inside a circle. This can be done by comparing the squared distance between the point and the centre of the circle with the square of the radius.

The condition is:

`(px - cx)² + (py - cy)² ≤ r²`

This can be useful when selecting circles using mouse input. For example, when a user clicks on the canvas, the program can check whether the clicked point lies inside any of the circles.

---

### Topic 5: Trees and Binary Trees

The second major topic of the lecture was trees. We learned that a tree is a hierarchical data structure consisting of nodes connected by edges. Some of the important terms discussed were root, parent, child, sibling, leaf, internal node, depth and height.

We then learned about binary trees, where each node can have at most two children: a left child and a right child.

A Binary Search Tree (BST) follows an additional ordering rule. Values smaller than a node are placed on the left side, while larger values are placed on the right side. We also discussed how the efficiency of operations such as searching depends on whether the tree is balanced or becomes highly unbalanced.

## Reflection

I found this lecture interesting because it connected the graphical concepts we have been learning with more interactive features. Drawing circles based on mouse clicks and connecting them with arrows showed me how coordinates can be used not only to draw static shapes but also to create interactive applications.

The introduction to trees and binary search trees was also useful because it connected the lecture with data structures. Learning the different tree terms helped me understand how nodes are organized and how a binary search tree can make searching more efficient when it is properly balanced.

Overall, the lecture helped me understand both the practical side of JavaFX graphics and the basic concepts of tree-based data structures.

