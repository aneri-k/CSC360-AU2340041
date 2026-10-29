# Class Reflection — 22 October 2026

## Topics
- Writing a good README
- Standard Maven project structure
- Writing clear Git commit messages
- Javadocs and code-level documentation
- Automated testing and the Arrange-Act-Assert pattern

## Notes

### 1. Writing a good README

During this class, we discussed how a README file is an important part of any software project because it gives people an overview of the project without requiring them to go through the source code.

A good README should explain the purpose of the project, the problem it solves, its main features, and the technologies used. It should also include the prerequisites required to run the application and clear instructions for building, testing, and running it.

We also learned that adding screenshots or a short demonstration of the application can make the README more useful, especially for projects with a graphical user interface. Diagrams can also help explain the architecture and how different components interact.

Another important point was that the README should accurately describe the current state of the project. It should mention any known limitations and possible future improvements instead of presenting planned features as if they have already been implemented.

### 2. Standard Maven project structure

We discussed the importance of following a standard folder structure when developing Java applications. Maven follows a conventional structure, which makes projects easier to understand and allows development tools to identify source files, resources, and tests automatically.

A typical Maven project contains the following:

```text
my-project/
├── pom.xml
├── README.md
├── .gitignore
└── src/
    ├── main/
    │   ├── java/       # Main Java source code
    │   └── resources/  # Images, FXML, CSS, etc.
    └── test/
        ├── java/       # Test classes
        └── resources/  # Test data and configurations
```

The `pom.xml` file contains the project's configuration and dependencies. The `src/main/java` folder contains the main application code, while `src/test/java` contains the test classes. Resources such as images, FXML files, and CSS files can be stored under `src/main/resources`.

Following this structure makes it easier to organise a project and work with tools such as IntelliJ IDEA and Maven. It also helps when setting up automated builds and testing because Maven already knows where to find the different files.

### 3. Writing clear Git commit messages

Another topic covered in class was writing meaningful Git commit messages. A commit message should explain what was changed instead of using general descriptions such as `fixed bugs` or `updated code`.

For example, a message like `fix(geometry): handle parallel line intersections` gives a much clearer idea of the change being made.

We also discussed the importance of keeping commits focused on a specific task instead of combining many unrelated changes into one commit. This makes the project history easier to read and helps developers understand why a particular change was introduced.

Clear commit messages are also useful when debugging because they make it easier to identify when a problem was introduced. If a change causes an issue, it is easier to review or revert a specific commit when the changes are organised properly.

We also learned about common commit types:

- `feat` for adding a new feature
- `fix` for correcting a bug
- `docs` for documentation changes
- `refactor` for restructuring code without changing its main functionality
- `test` for adding or updating tests
- `chore` for maintenance and configuration changes

These conventions help maintain a consistent and understandable Git history, especially when multiple people are working on the same project.

### 4. Javadocs and code documentation

We learned that documentation in a software project exists at different levels. The README provides a general overview of the project, while Javadocs explain the code in more detail for developers who need to understand or use individual classes and methods.

Javadocs can describe what a method does, what parameters it accepts, what it returns, and which exceptions it may throw. This is particularly useful when a project contains multiple classes with different responsibilities.

We also discussed that comments should provide useful information rather than simply repeating what the code already says. For example, instead of writing a comment that only says a method sets a value, the documentation should explain the method's purpose, any restrictions on its inputs, and what happens in special cases.

Some important Javadoc tags are:

- `@param` explains a method's parameters.
- `@return` describes the value returned by a method.
- `@throws` explains the conditions under which an exception may occur.
- `@see` refers to related methods, classes, or documentation.

For example, a method that calculates the intersection of two lines should explain that parallel or coincident lines do not have a unique intersection. This helps another developer understand how the method behaves in edge cases.

We also learned that Javadocs can be generated as HTML documentation using the Maven command `mvn javadoc:javadoc`. This makes the documentation easier to browse and use.

### 5. Automated testing

The final major topic was automated testing and why it should be included as part of the development process instead of being left until the end.

We discussed three main types of testing:

**Unit testing:** Tests individual classes or methods separately to check whether they behave as expected. JUnit 5 is a commonly used framework for writing unit tests in Java.

**Integration testing:** Checks whether multiple parts of the application work correctly together. For example, it can verify that an equation parser produces the correct output and that the geometry component processes that output properly.

**System and UI testing:** Checks the application as a whole, including how it behaves when a user interacts with the interface. TestFX can be used for testing JavaFX applications.

We also learned about the Arrange-Act-Assert pattern, which divides a test into three parts:

1. **Arrange:** Set up the required inputs and conditions.
2. **Act:** Execute the method or operation being tested.
3. **Assert:** Check whether the actual result matches the expected result.

For example, when testing a triangle application, we could provide three collinear points and check that the application rejects them instead of treating them as a valid triangle.

Automated tests help detect errors, prevent existing functionality from breaking when the code is changed, and make refactoring safer. They also act as a form of documentation because they demonstrate the expected behaviour of different parts of the application.

## Reflection

This class helped me understand that developing a good software project involves more than just making the application work. The way the code is organised, documented, tested, and maintained is equally important. I learned how a clear README helps others understand the project, how Maven's standard structure keeps the code organised, and how meaningful commit messages make collaboration easier. Javadocs and automated testing are also important because they help developers understand the code and make changes without introducing new problems. Overall, these practices make a project easier to maintain and more professional, especially when working in a group.
