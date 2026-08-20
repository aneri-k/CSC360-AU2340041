# Reflection: Java Graphics, Maven & AWT

**Date:** 18/08/2026

The lecture helped me understand how a graphical program can be designed to draw a square based on user inputs and default values. We discussed that the basic inputs required are the length of one side and the square's position on the canvas, which can be inputted using the coordinates of the square's centre point. We also considered how default values can be used so that the program does not need to ask the user for every value. For example, the square's centre can be set to the canvas centre by default.

We then discussed how to calculate the four corners of a square when its centre and side length are known. The upper-left corner (UL) can be calculated using `(C_x - l/2, C_y - l/2)`, where `C_x` and `C_y` represent the centre of the square and `l` represents the side length. The other three corners (UR, LL, LR) can be calculated relative to the UL. This helped me understand how coordinate geometry and programming are connected when creating graphical shapes.

Another important part of the lecture was understanding the structure of a Maven project and the role of different folders and files. We also discussed AWT and how some of its core functionality has remained consistent for many years. I learned about JAR files and how they are essentially archive files used to package Java classes and other resources. We also discussed JFrame as a window that can display a graphical application, such as the popup window created for the square program.

We also discussed the difference between objects and static members in Java. This helped me better understand how Java programs manage data and functionality and why some methods or variables belong to individual objects while static members belong to the class itself. Overall, the lecture strengthened my understanding of Java graphics, coordinate systems, Maven project organization, and basic Java programming concepts.
