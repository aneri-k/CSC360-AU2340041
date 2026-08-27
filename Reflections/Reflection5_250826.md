# Class Reflection (25 August 2026)

## Topics

* Git workflow and synchronising the local repository
* Importance of a `README.md` file
* Maven in IntelliJ IDEA
* Purpose of `pom.xml`
* Accessibility in Java Swing
* Multithreading
* Event Dispatch Thread (EDT)
* Keeping graphical applications responsive

## Notes

### Topic 1: Git and Project README

I was unable to attend this session due to a placement interview, so I reviewed the topics covered in the lecture through my friend's and classmates' reflections.

One of the topics discussed was the importance of updating the local Git repository before starting new work. The git pull command can be used to bring the latest changes from the remote repository. It is also useful to check the current branch and any uncommitted changes using commands such as git status.

The class also covered the importance of a `README.md` file. A README provides information about a project and helps other developers understand its purpose, requirements, setup process and usage. This made me realize that documentation is an important part of a project because it makes the codebase easier for others to understand and use.

---

### Topic 2: Maven and `pom.xml`

Another topic covered was using Maven through IntelliJ IDEA. Maven helps manage Java projects, dependencies and the build process. The Maven tool window in IntelliJ can be used to run commands such as `clean`, `compile`, `test` and `package`.

I also learned more about the role of the `pom.xml` file. It contains the main configuration of a Maven project, including project information, dependencies, Java version and build plugins. This connects with what I learned in previous classes about Maven and helped me understand why the `pom.xml` file is so important in a Maven project.

---

### Topic 3: Accessibility in Swing

The lecture also discussed accessibility in Java Swing applications. Swing components support accessibility features, but simply using Swing does not automatically make an application accessible.

Some of the important considerations include meaningful component names, keyboard navigation, visible focus indicators and sufficient colour contrast. From reviewing this topic, I understood that accessibility needs to be considered while designing an application so that it can be used by a wider range of users.

---

### Topic 4: Multithreading and the Event Dispatch Thread

The topic I found most interesting was multithreading in graphical applications. I learned that Swing uses an Event Dispatch Thread (EDT) to handle user interface events and painting. If a long-running operation is performed on this thread, the interface can stop responding to user actions and appear frozen.

Tasks such as large calculations, file operations or network requests should therefore be performed in the background rather than directly on the EDT. `SwingUtilities.invokeLater()` can be used to run GUI-related code on the EDT, while `SwingWorker` can be used when a background task needs to update the graphical interface.

This helped me understand why thread management is important even for applications that may appear simple.

## Reflection

Although I could not attend this session, reviewing the topics afterwards helped me understand several concepts important to Java development. The discussion about Git and Maven connected well with the work we have already done in previous classes.

The concept of the Event Dispatch Thread was particularly useful because it explained why a Swing application can become unresponsive when a long-running task is executed incorrectly. I also learned that good software development includes documentation and accessibility, not just writing code.

Overall, reviewing this lecture helped me catch up on the concepts covered in the session and understand how project management, Java development and user experience are connected.
