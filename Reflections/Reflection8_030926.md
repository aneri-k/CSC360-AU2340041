# Class Reflection (3 September 2026)

## Topics

* Text terminals and graphical user interfaces
* Accessing remote computers using SSH
* Finding matching elements between two lists
* Drawing arrows between matching elements
* Reproducing software failures
* JavaFX interfaces using FXML

## Notes

### Topic 1: Text Terminals and Graphical User Interfaces

The lecture started with a comparison between text terminals and graphical user interfaces. A terminal allows users to interact with a computer by entering commands, while a GUI provides visual components such as windows, buttons and menus.

Both approaches have their own advantages. Terminals are useful for automation, remote access and running commands quickly, while GUIs are generally easier to use for visual and interactive tasks. This helped me understand why both are still commonly used in software development.

---

### Topic 2: Accessing Remote Computers Using SSH

We also learned about **SSH (Secure Shell)**, which is used to securely connect to another computer over a network. Through SSH, commands can be executed on a remote computer in the same way as working with a local terminal.

This can be useful for tasks such as managing servers, building applications and working with files on a remote machine. I found this particularly useful because remote access is an important part of working with servers and development environments.

---

### Topic 3: Finding Matching Elements Between Lists

Another topic covered was finding common elements between two lists. The basic approach is to compare the elements of one list with the elements of another list and record the positions of matching values.

A nested loop can be used for this, although it can become inefficient when the lists are large. We also discussed using a `HashMap` to store the indexes of elements in one list, which can make finding matches faster.

An important point was that the program needs to define how duplicates and differences such as case sensitivity should be handled before implementing the matching logic.

---

### Topic 4: Drawing Arrows Between Matching Elements

The matching elements can then be visually connected using arrows in JavaFX. The position of each element needs to be known so that an arrow can be drawn between the matching items.

We also discussed using `Math.atan2()` to calculate the direction of an arrow and determine the position of its arrowhead. This connected the list-matching problem with the graphical concepts we have been learning.

I found this interesting because the program was not only finding the matching data but also representing the result visually.

---

### Topic 5: Reproducing Software Failures

The lecture also discussed the importance of being able to reproduce software failures. A bug is much easier to investigate when there is a clear sequence of steps that consistently produces the same problem.

A useful failure report should include the steps to reproduce the issue, the expected and actual behaviour, error messages, software versions and other relevant environment details.

This showed me that debugging is not only about finding and fixing errors. Being able to clearly describe and reproduce a problem is also an important part of software development.

---

### Topic 6: FXML in JavaFX

The final topic was **FXML**, which is an XML-based way of defining JavaFX user interfaces. Instead of creating the entire interface directly in Java code, FXML can be used to describe the layout and components separately from the application logic.

A controller class can then contain the behaviour of the interface, such as what happens when a button is clicked. This separation can make larger JavaFX applications easier to organize and maintain.

I also learned that FXML can be used with tools such as Scene Builder to make designing interfaces easier.

## Reflection

I found this lecture useful because it covered both practical development concepts and JavaFX programming. The comparison between terminals and GUIs helped me understand that different interfaces are useful for different tasks, while SSH showed how terminal-based tools can be used to work with remote computers.

The part about matching elements and connecting them with arrows was especially interesting because it combined data structures, algorithms and graphical programming. I also understood the importance of writing clear steps when reporting a software failure, since a bug cannot always be fixed easily if it cannot be reproduced.

Overall, the lecture showed me how different parts of software development, such as debugging, algorithms, remote access and user interface design, can work together in a project.
