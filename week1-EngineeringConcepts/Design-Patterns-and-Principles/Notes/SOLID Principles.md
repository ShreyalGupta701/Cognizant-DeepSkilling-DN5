### Introduction to SOLID Principles
- SOLID Principles were introduced by Robert C. Martin (Uncle Bob) in 2000.
- Later, Michael Feathers created the acronym SOLID.
- These principles are used to improve Object-Oriented Programming (OOP) design.
- They help developers write better and more organized code.
###  Why Are SOLID Principles Important?
- Make code **easy to understand**.
- Make code **easy to maintain**.
- Improve the **flexibility** of software.
- Reduce the **complexity** of large applications.
- Make future changes and updates easier.
- Help developers create **clean and reusable code**.
- Save time and effort during software development.
##### The following five concepts make up our SOLID principles:

1. Single Responsibility Principle
2. Open/Closed Principle
3. Liskov Substitution Principle 
4. Interface Segregation Principle
5. Dependency Inversion Principle

## Single Responsibility Principle (SRP)
A class should have **only one responsibility** and **one reason to change**.
###  Benefits
- Easy to test
- Low coupling
- Better organization
- Easy maintenance**

### Example:-
```
class Book {
    String name;

    Book(String name) {
        this.name = name;
    }
}

class BookPrinter {
    void print(Book book) {
        System.out.println(book.name);
    }
}

```

## 2. Open/Closed Principle (OCP)
A class should be:
- Open for Extension
- Closed for Modification

### Benefits
- Add new features without changing existing code
- Reduces bugs

### Example :-
Instead of modifying `Guitar`, create a subclass.

```
class Guitar {
    void play() {
        System.out.println("Playing Guitar");
    }
}

class FlameGuitar extends Guitar {
    void showFlames() {
        System.out.println("Flame Design Added");
    }
}
```

## 3. Liskov Substitution Principle (LSP)
A child class should be able to replace its parent class without changing program behavior.

### Benefits
- Proper inheritance
- Reliable code

### Example :-

```
class Bird {
    void move() {
        System.out.println("Bird is moving");
    }
}

class Sparrow extends Bird {
    void move() {
        System.out.println("Sparrow is flying");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird bird = new Sparrow();
        bird.move();
    }
}
```

## 4. Interface Segregation Principle (ISP)
A class should not be forced to implement methods it does not need.

### Benefits
- Small interfaces
- Better flexibility
- Easy maintenance

### Example :-

Split one large interface into smaller interfaces.
```
interface BearCleaner {
    void washBear();
}

interface BearFeeder {
    void feedBear();
}

class BearCarer implements BearCleaner, BearFeeder {

    public void washBear() {
        System.out.println("Bear washed");
    }

    public void feedBear() {
        System.out.println("Bear fed");
    }
}
```


## 5. Dependency Inversion Principle (DIP)
High-level modules should depend on abstractions, not concrete classes.
### Benefits
- Loose coupling
- Easy testing
- Easy replacement of components

### Example :-

```
interface Keyboard {
    void type();
}

class StandardKeyboard implements Keyboard {
    public void type() {
        System.out.println("Typing...");
    }
}

class Computer {
    private Keyboard keyboard;

    Computer(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    void use() {
        keyboard.type();
    }
}


```