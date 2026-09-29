# Reflection — Master-Detail Library Project

## Group 10 project: Library Master-Detail Layout

During this class, I worked with my group on completing our Master-Detail Layout project for a library. The main focus of the session was to implement the complete project, understand how the existing code works, and make the GitHub repository more organised and presentable.

**Project repository:** https://github.com/NirjaraJain/CSC360-Group10

## Project objective

Our project is a Java-based desktop application that displays a list of books in a library using a Master-Detail Layout.

The application has two main sections:

* **Master View:** Displays the list of available books.
* **Detail View:** Displays information about the book selected from the list.

The project also includes features such as searching for books and displaying their availability.

---

## Work done during the class

### 1. Implemented the complete project

During the session, we worked on the project and implemented the complete Master-Detail application. The final application allows the user to view the available books, select a particular book, and see its detailed information.

The detail section can show information such as:

* Book title
* Author
* Description
* Category
* Publisher
* Price
* Publication month
* Publication year

This helped me understand how the master and detail sections are connected and how selecting an item in one part of the interface can update the information shown in another part.

### 2. Understanding the code

Along with implementing the project, I spent time understanding how the different parts of the code work together. Instead of only focusing on getting the application to run, I tried to understand the flow from the book list to the selected book and then to the information displayed in the detail section.

This made the Master-Detail concept clearer to me because I could see how the individual components of the interface were connected in the actual implementation.

### 3. Working with the project structure

We also looked at how the project was organised as a Java project. The repository contains the Java source code under `src/main`, along with the `pom.xml`, `.gitignore`, and `README.md`.

Understanding this structure helped me connect the project work with what we had previously learned about Maven and organising Java projects.

### 4. Improving the GitHub repository

Another part of the session was making the GitHub repository look cleaner and more complete.

We worked on the README so that it clearly explains what the project is, what the Master-Detail Layout does, and what features are available. The repository now describes the project as a Library Master-Detail Layout and includes an overview, features, and the information displayed for each book.

This was useful because a project is not only about the code itself. The repository should also make it easy for someone else to understand what the project does and how it is organised.

---

## Project structure

The overall flow of our application can be understood as:

```text
Library Book List
       ↓
Select a Book
       ↓
Retrieve Book Information
       ↓
Display Details
```

The master section provides the list of books, while the detail section changes based on the selected book. The project also includes a search feature, which makes it easier to find a particular book in the library.

---

## What I learned

This class helped me understand the Master-Detail Layout much better because we were able to implement the complete project instead of only discussing the concept.

I also learned that understanding existing code is important when working on a project. It is not enough for the application to work; I should also know how the different classes and components are connected so that I can make changes or fix problems later.

Working on the GitHub repository also showed me the importance of keeping project documentation clear. A well-organised README makes it easier for someone to understand the purpose and features of the project without having to go through the entire codebase.

## Final reflection

Overall, this session was useful because we completed the implementation of our library Master-Detail project while also taking time to understand the code behind it. I got a better understanding of how the master and detail views interact and how a Java application can be organised into different parts. Improving the GitHub repository at the same time also helped me understand that documentation and presentation are important parts of a software project.
