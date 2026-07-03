# Design Patterns
A Design Pattern is a proven and reusable solution to a commonly occurring problem in software design. It provides a standard way to solve design issues and helps developers create software that is easier to maintain, extend, and understand.

## Why Use Design Patterns?
Design patterns are used because they:
- Improve code reusability.
- Make code easier to maintain.
- Reduce code duplication.
- Increase flexibility and scalability.
- Follow industry best practices.
- Provide a common language among developers.
- Simplify complex software design problems.

### Benefits

1. Better software architecture  
2. Easier debugging and testing  
3. Faster development process  
4. Improved readability of code  
5. Easier collaboration among team members

## Types of Design Patterns
Design patterns are generally classified into three categories:
### 1. Creational Patterns
These patterns deal with **object creation** mechanisms.
**Purpose:** Create objects in a flexible and controlled manner.

**Examples:**

- Singleton Pattern
- Factory Method Pattern
- Builder Pattern

**Benefits:**

- Hides object creation logic.
- Reduces dependency on concrete classes.
- Improves flexibility.

---

### 2. Structural Patterns

These patterns focus on **how classes and objects are combined** to form larger structures.

**Purpose:** Ensure objects work together efficiently.

**Examples:**

- Adapter Pattern
- Decorator Pattern
- Composite Pattern
- Proxy Pattern

**Benefits:**

- Simplifies relationships between objects.
- Improves code organization.
- Enhances flexibility.

---

### 3. Behavioral Patterns

These patterns deal with **communication and interaction** between objects.

**Purpose:** Define how objects collaborate and share responsibilities.

**Examples:**

- Observer Pattern
- Strategy Pattern
- Command Pattern

**Benefits:**

- Improves object communication.
- Reduces coupling.
- Makes behavior easier to modify and extend.

# Common Design Patterns

# 1. Singleton Pattern

## Definition

Singleton Pattern is a creational design pattern that ensures only one object of a class is created throughout the application. It also provides a single point through which that object can be accessed.

## Why Use It?

- Ensures only one instance of a class exists.
- Saves memory by avoiding multiple object creation.
- Provides centralized access to shared resources.

## Example

A printer manager in an office system where all print requests are handled by a single printer controller.

## Use Cases

- Logger
- Database Connection
- Configuration Manager

---

# 2. Builder Pattern

## Definition

Builder Pattern is used to create complex objects step by step. It separates the construction process from the final representation of the object.

## Why Use It?

- Makes object creation easier.
- Improves code readability.
- Avoids constructors with too many parameters.

## Example

Building a burger by selecting different ingredients such as bun, patty, cheese, and sauce.

## Use Cases

- StringBuilder in Java
- Complex object creation
- Configuration setup

---

# 3. Factory Pattern

## Definition

Factory Pattern provides a way to create objects without exposing the object creation logic to the client.

## Why Use It?

- Encapsulates object creation.
- Reduces dependency on specific classes.
- Makes the code easier to extend.

## Example

A vehicle factory that creates different types of vehicles such as Car, Bike, or Truck based on user requirements.

## Use Cases

- Database Drivers
- Notification Services
- UI Components

---

# 4. Adapter Pattern

## Definition

Adapter Pattern allows two incompatible interfaces to work together by acting as a bridge between them.

## Why Use It?

- Helps integrate existing systems.
- Allows reuse of old code.
- Improves compatibility between components.

## Example

A mobile charger adapter that converts one type of connector into another.

## Use Cases

- Legacy System Integration
- Third-Party Libraries
- Payment Gateway Integration

---

# 5. Decorator Pattern

## Definition

Decorator Pattern is used to add new functionality to an object dynamically without modifying its existing code.

## Why Use It?

- Extends functionality at runtime.
- Provides flexibility.
- Reduces the need for inheritance.

## Example

Adding extra features to a coffee such as milk, sugar, or chocolate.

## Use Cases

- Java I/O Streams
- GUI Components
- Feature Extensions

---

# 6. Observer Pattern

## Definition

Observer Pattern establishes a one-to-many relationship between objects. When one object changes its state, all dependent objects are automatically notified.

## Why Use It?

- Supports event-driven programming.
- Reduces coupling between components.
- Makes communication easier.

## Example

Subscribers receiving notifications whenever a YouTube channel uploads a new video.

## Use Cases

- Notification Systems
- Event Handling
- Stock Market Applications

---

# 7. Strategy Pattern

## Definition

Strategy Pattern defines a family of algorithms and allows the required algorithm to be selected during runtime.

## Why Use It?

- Makes algorithms interchangeable.
- Improves flexibility.
- Reduces large conditional statements.

## Example

A navigation application choosing different routes for car, bike, or walking mode.

## Use Cases

- Payment Methods
- Sorting Algorithms
- Navigation Systems

---

# 8. Facade Pattern

## Definition

Facade Pattern provides a simple interface to a complex subsystem, making it easier for clients to use.

## Why Use It?

- Hides system complexity.
- Improves usability.
- Reduces dependencies on subsystem components.

## Example

A TV remote control that allows users to operate a television without understanding its internal workings.

## Use Cases

- Banking Systems
- E-commerce Applications
- Home Automation

---

# 9. MVC (Model-View-Controller) Pattern

## Definition

MVC is an architectural pattern that divides an application into three components: Model, View, and Controller.

## Components

|Component|Responsibility|
|---|---|
|Model|Manages data and business logic|
|View|Displays data to the user|
|Controller|Handles user requests and updates Model and View|

## Why Use It?

- Separates responsibilities.
- Makes maintenance easier.
- Improves scalability.

## Example

In an online shopping application:

- Model stores product information.
- View displays products to users.
- Controller processes user actions.

---

# 10. MVVM (Model-View-ViewModel) Pattern

## Definition

MVVM is an architectural pattern that introduces a ViewModel between the View and Model. The ViewModel acts as a bridge and manages the interaction between them.

## Components

|Component|Responsibility|
|---|---|
|Model|Handles data and business logic|
|View|User interface|
|ViewModel|Connects View and Model|

## Why Use It?

- Supports data binding.
- Improves separation of concerns.
- Makes testing easier.

## Example

In an Android application:

- Model retrieves data from the database.
- ViewModel processes and prepares data.
- View displays the data to the user.