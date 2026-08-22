# Class Reflection (18 August 2026)


## Topics

* Maven and Java project management
* Maven project and folder structure
* pom.xml and project dependencies
* Maven build commands
* Drawing a square using coordinates
* Setting default values for graphical inputs

## Notes


### Topic 1: Maven and Project Structure

The lecture introduced Maven and its importance in managing Java projects. Maven provides a standard structure for organizing Java projects, which makes it easier to manage source files, dependencies, and build-related files. One of the main files in a Maven project is the pom.xml file. It contains important information about the project, such as its name, version, dependencies, and build configuration.

A basic Maven project was created during the practical part of the lecture. The folder structure helped demonstrate how Maven separates the source code and other project-related files. Understanding this structure is important because Maven commands depend on the project being organized correctly.

A useful command introduced during the lecture was mvn clean package. This command can be used to clean previous build files and package the project after compiling and testing it. An important practical point was that Maven commands need to be executed from the correct project directory, specifically the directory containing the pom.xml file. Running the command from another folder can result in errors because Maven cannot find the project configuration.

---

### Topic 2: Drawing a Square Using Coordinates

The lecture also focused on the basic concepts involved in drawing a square on a graphical canvas. Before drawing the square, we need to give some inputs. The main inputs are the length of one side of the square and the square's position on the canvas.

Default values can also be provided. For example, the square's centre can be set to the canvas centre by default. This makes the application easier to use and reduces unnecessary user input.

To draw the square, the coordinates of its four corners need to be calculated. If `(C_x, C_y)` represents the centre of the square and `l` represents the side length, the upper-left corner can be calculated using:

`(C_x - l/2, C_y - l/2)`

The remaining three corners can then be calculated from the upper-left corner:

* **Lower-left:** `(C_x - l/2, C_y + l/2)`
* **Upper-right:** `(C_x + l/2, C_y - l/2)`
* **Lower-right:** `(C_x + l/2, C_y + l/2)`

This approach showed how mathematical calculations and coordinate geometry are directly connected to computer graphics. By calculating the coordinates from the centre and side length, the square can remain properly positioned even when the canvas dimensions change.

---

### Topic 3: Controlling the Appearance of the Square

The square created during the practical work was not only positioned using coordinates but also modified in appearance. Properties such as colour, size, and line thickness can be controlled through the graphics classes.

BasicStroke can be used to control the thickness of a shape's outline. Increasing the stroke width makes the square's border appear thicker. 

Calculating the square's position based on the window's dimensions also made the application more flexible. Instead of using fixed coordinates, the square could be positioned relative to the centre of the canvas.
