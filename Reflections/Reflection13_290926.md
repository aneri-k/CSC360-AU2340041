# Reflection — 29 September 2026

## Group 10 project: Library Master-Detail System

During this class, I worked on understanding and refining my project, which is a **Library Management System using a Master-Detail Layout**. The focus was on understanding how the different parts of the application work together and improving the overall project and its GitHub repository.

**Project repository:** https://github.com/NirjaraJain/CSC360-Group10

## Project objective

Our project is a Java desktop application that manages books, library members, and borrowing records. The Master-Detail Layout displays a list of records on one side and the details of the selected record on the other, making the interface easier to use.

The main features include:

- Viewing, searching, and filtering books and members.
- Adding, editing, and deleting records.
- Borrowing and returning books.
- Tracking overdue loans and fines.
- Displaying library statistics through a dashboard.

The project uses Java 21, JavaFX, and Maven, with an in-memory repository for storing records while the application is running.

---

## Work covered during the class

### 1. Understanding the Master-Detail Layout

The main concept of our project is to separate the list of records from their detailed information. In the books section, the master view displays the list of books, while the detail view shows information about the selected book. The same layout is used for members and loans.

This helped me understand how a single layout can be reused for different types of records instead of creating a completely different interface for each screen.

### 2. Understanding the project classes

We reviewed the different classes and their responsibilities in the application.

| Class | Purpose |
|---|---|
| `Book` | Stores book details, including title, author, category, and copies. |
| `Member` | Stores library member information and status. |
| `Loan` | Tracks borrowing records, due dates, status, and fines. |
| `InMemoryRepository` | Stores and manages records. |
| `LibraryService` | Handles borrowing, returning, overdue tracking, and related operations. |
| `MasterDetailView` | Provides a reusable master-detail layout. |
| `MainApp` | Starts the application and manages navigation. |

Understanding these classes helped me see why the project is divided into separate components and how each one contributes to the overall application.

### 3. Understanding the application flow

I also focused on understanding how the different components communicate. For example, when a user borrows a book, the application needs to create a loan record, update the available copies, and reflect the changes in the interface.

The general flow is:

```text
User Interaction
       ↓
JavaFX Interface
       ↓
LibraryService
       ↓
Repository and Data Models
       ↓
Updated Records and Interface
```

This showed me why the user interface, business logic, and data storage should be separated. It makes the application easier to understand, test, and maintain.

### 4. CRUD operations and data consistency

Our project supports CRUD operations: Create, Read, Update, and Delete. These are used to manage books, members, and loans.

We also looked at how borrowing and returning books affect related records. When a book is borrowed, its available copies should decrease, and when it is returned, the loan status and available copies should be updated.

This helped me understand the importance of keeping data consistent across different screens. Input validation is also necessary to prevent incorrect values, such as having more available copies than the total number of copies.

### 5. Understanding the JavaFX interface

We reviewed how different JavaFX layout containers are used to organise the application:

- `BorderPane` structures the main window.
- `HBox` and `VBox` arrange components horizontally and vertically.
- `GridPane` organises forms and dashboard cards.
- `SplitPane` places the master list beside the detail panel.
- `ScrollPane` allows users to view content that does not fit on the screen.

Understanding these components helped me see how the interface is structured and how the different screens maintain a consistent layout.

### 6. Improving the GitHub repository

Another part of the work was making the GitHub repository more organised and presentable. A good README should explain the project's purpose, features, technologies, and instructions for running the application.

For our project, the documentation should also help readers understand the different screens and the relationship between books, members, and loans. Screenshots can make the application easier to understand without requiring someone to read the entire codebase.

This showed me that documentation is an important part of software development, alongside implementing the actual features.

---

## Challenges and future improvements

One of the main challenges in our project is keeping related records consistent. Borrowing and returning a book affects the loan, the book's available copies, and the member's borrowing information.

Another limitation is that the application uses an in-memory repository, so records are not automatically saved after the application closes. In the future, the project could be improved by adding database storage, more automated tests, loan history reports, and due-date reminders.

## What I learned

This class helped me understand how the different parts of our Library Management System work together. I learned how the Master-Detail Layout can be reused, how services and repositories manage data, and how CRUD operations are applied to different entities.

I also understood that reading and tracing the code is important because knowing how a feature works makes it easier to debug and improve it. Keeping the GitHub repository organised and documenting the project properly are equally important because they help other people understand and work with the code.

## Key takeaway

The main takeaway from this class was understanding how JavaFX interface design, object-oriented programming, data management, and business logic come together in a complete application. It also reinforced the importance of maintaining clear documentation and an organised project structure.
