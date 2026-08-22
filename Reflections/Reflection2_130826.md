# Class Reflection


## Topics

* Maven and Java project management
* Maven project structure and pom.xml
* Maven build commands
* Java Swing
* Graphics and Graphics2D
* Drawing and positioning a square
* BasicStroke
* Troubleshooting Maven and project files



## Notes


### Topic 1

The lecture introduced Maven and its role in managing Java projects. Maven provides a standard structure for organizing a Java project, which makes it easier to manage source files, dependencies, and other project-related files. The pom.xml file is an important part of a Maven project because it contains the project configuration and information about its dependencies.

A basic Maven project was created during the practical work. The mvn clean package command was also used to build the project. An important point I learned was that Maven commands need to be executed from the correct project directory containing the pom.xml file. Running the command from the wrong directory can cause errors because Maven cannot identify the project.

### Topic 2

The lecture also covered Java Swing and the use of the Graphics and Graphics2D classes for creating graphical applications. A simple window was created that displayed a hollow square. Through this exercise, I learned how to control different properties of the square, including its position, size, color, and line thickness.

The BasicStroke class was used to increase the thickness of the square's outline. I also learned how calculating the square's coordinates based on the dimensions of the window allows it to remain centered. This helped me understand how coordinate calculations can be used to position graphical objects accurately.

### Reflection

During the practical work, I faced some issues such as running Maven from the wrong directory and trying to rename a folder while it was still being used by another process. Resolving these problems helped me understand that working with a development environment requires attention to both the code and the project setup.

Overall, the lecture gave me a better understanding of Maven, Java project organization, and basic graphical programming. The practical exercise of creating and modifying a square also helped me connect programming concepts with coordinate geometry and graphical output. The troubleshooting experience was useful as it improved my understanding of common problems that can occur while working with Java projects and command-line tools.
