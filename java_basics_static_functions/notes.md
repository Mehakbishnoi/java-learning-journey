# Java Notes – Lecture 1
# Java Basics & Static Functions

---

## Overview

This lecture covers the basic concepts of Java, including:

- Java Program Execution
- Naming Conventions
- Class Naming Rules
- `main()` Method
- Static Functions
- Calling Static Functions
- Non-Static Functions
- Object Creation
- Garbage Collection

---

# 1. Java Program Execution

A Java program follows the execution flow shown below:

```text
Home.java
     │
     ▼
Compiler
     │
     ▼
Home.class (Bytecode)
     │
     ▼
JVM (Java Virtual Machine)
     │
     ▼
Output
```

### Explanation

- Java source code is written in a `.java` file.
- The Java compiler converts the source code into a `.class` file.
- The `.class` file contains bytecode.
- JVM executes the bytecode and generates the output.

### Example

Source File

```text
Home.java
```

After Compilation

```text
Home.class
```

---

# 2. Naming Convention

Java follows standard naming conventions to improve code readability.

## Pascal Case

### Rules

- Every word starts with a capital letter.
- Used for class names.

### Examples

```text
ArrayOutOfBoundsException
String
System
```

---

## Camel Case

### Rules

- First word starts with a lowercase letter.
- Every following word starts with a capital letter.
- Used for variables and methods.

### Examples

```text
arrayOutOfBoundsException
myName
studentData
```

---

# 3. Class Naming Rule

If a file contains a **public class**, then the file name must be the same as the public class name.

### Example

```java
public class Home {

}
```

File Name

```text
Home.java
```

---

# 4. Program Execution Starts from `main()`

The execution of every Java application starts from the following method:

```java
public static void main(String[] args)
```

### Why?

The JVM searches for this method first and starts executing the program from here.

---

# 5. Static Functions

A function declared using the `static` keyword is called a **static function**.

Static functions belong to the class instead of an object.

---

## Rule

Inside a static function:

- Another static function can be called directly.
- A non-static function cannot be called directly.

---

## Example

```java
class Example {

    static void fun1() {
        System.out.println("A");
    }

    static void fun2() {
        System.out.println("B");
    }

    public static void main(String[] args) {

        System.out.println("C");

        fun1();
    }
}
```

### Output

```text
C
A
```

### Explanation

- `main()` is a static function.
- `fun1()` is also static.
- Therefore, `fun1()` can be called directly inside `main()`.

---

# 6. Same Static Function Name in Different Classes

Different classes can have methods with the same name.

### Area Class

```java
class Area {

    static void fun1() {
        System.out.println("My Name");
    }

}
```

### Example Class

```java
class Example {

    static void fun1() {
        System.out.println("A");
    }

    public static void main(String[] args) {

        fun1();

        Area.fun1();

    }
}
```

### Output

```text
A
My Name
```

### Explanation

```java
fun1();
```

Calls the method of the current class.

```java
Area.fun1();
```

Calls the method of the `Area` class.

---

# 7. Non-Static Functions

Functions that are **not declared using `static`** are called:

- Non-static functions
- Instance member functions

They belong to an object instead of the class.

---

# 8. Calling Non-Static Functions

A non-static function cannot be called directly from `main()`.

An object must be created first.

### Syntax

```java
ClassName referenceVariable = new ClassName();
```

### Example

```java
Run r = new Run();
```

### Explanation

| Part | Meaning |
|------|---------|
| `Run` | Class Name |
| `r` | Reference Variable |
| `new` | Creates a new object |

---

# 9. Example of Non-Static Function

```java
class Run {

    int x;
    int y;

    void fun1() {
        System.out.println("A");
    }

}
```

Main Class

```java
class Object1 {

    public static void main(String[] args) {

        Run r = new Run();

        System.out.println(r.y);

    }

}
```

### Output

```text
0
```

### Explanation

When an object is created, instance variables receive default values.

For `int`, the default value is:

```text
0
```

---

# 10. Object Creation

Objects are created using the `new` keyword.

### Syntax

```java
ClassName referenceVariable = new ClassName();
```

### Example

```java
Run r = new Run();
```

### Explanation

- `Run` → Class Name
- `r` → Reference Variable
- `new` → Creates a new object

---

# 11. Garbage Collection

### Example

```java
Example v1 = new Example();

v1 = new Example();
```

Initially

```text
v1 → First Object
```

After reassignment

```text
v1 → Second Object
```

The first object no longer has any reference pointing to it.

Such an object becomes **eligible for Garbage Collection**.

---

# Key Points

- Java source files use the `.java` extension.
- Compiled Java files use the `.class` extension.
- The compiler converts source code into bytecode.
- JVM executes the bytecode.
- Program execution starts from `main()`.
- Class names follow **Pascal Case**.
- Variables and methods follow **camelCase**.
- Static functions belong to the class.
- Non-static functions belong to objects.
- Static functions can be called directly from another static function in the same class.
- Non-static functions require object creation.
- Objects are created using the `new` keyword.
- Objects without any references become eligible for Garbage Collection.

---

# Interview Questions

1. What is the difference between a `.java` file and a `.class` file?
2. What is the role of the JVM?
3. From which method does Java execution start?
4. What is a static function?
5. Why can't a non-static function be called directly from `main()`?
6. What is the purpose of the `new` keyword?
7. What is a reference variable?
8. What is Garbage Collection in Java?
9. What is the difference between Pascal Case and camelCase?
10. Why is `main()` declared as `static`?