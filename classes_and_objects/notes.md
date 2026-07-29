# Classes and Objects in Java

## Class

A class is a blueprint or template used to create objects.

It defines:
- Data (variables/properties)
- Behavior (methods/functions)

A class represents the characteristics and actions that an object can have.

Example:

A `Car` class can define properties like color, model, and speed, and methods like start() and stop().

### Syntax

```java
class ClassName {

    // data members

    // methods

}

#Object

An object is an instance of a class.

It represents a real-world entity and contains:

State → Data stored in variables
Behavior → Actions performed using methods

Objects are created from classes.

Syntax:

ClassName objectName = new ClassName();

Example:

Student s1 = new Student();

Here:

=> Student is a class
=> s1 is an object

## Difference Between Class and Object

| Basis      | Class | Object |
|------|-------|--------|
| Definition | A class is a blueprint or template used to create objects. | An object is an instance of a class that represents a real-world entity. |

| Nature | It is a logical entity. | It is a physical entity. |

| Purpose | It defines the properties (variables) and behaviors (methods) of objects. | It uses the properties and behaviors defined by the class. |

| Memory Allocation | A class itself does not occupy memory when declared. | An object occupies memory when it is created. |
| Creation | Created using the `class` keyword. | Created using the `new` keyword. |

| Real-world Example | `Student` is a class that defines student properties. | `student1` is an object representing a particular student. |

| Data Storage | Contains the definition of variables and methods. | Contains actual values of variables. |

| Number of Instances | One class can create multiple objects. | Multiple objects can exist from the same class. |
| Access | Cannot directly access non-static members without an object. | Accesses class members using the dot (`.`) operator. |

| Memory Location | Stored as class information by JVM. | Objects are stored in heap memory. |

## Components of a class

1. Data Members

Variables declared inside a class are called data members.

They store the state or information of an object.

Example:

class Student {

    String name;
    int age;

}

Here:

name , age are data members.

2. Methods

Methods define the behavior or actions of an object.

Example:

void display(){

    System.out.println("Student Details");

}

A method describes what an object can do.

Creating an Object

Objects are created using the new keyword.

Example:

Student s1 = new Student();

Explanation:

Student → class name
s1 → reference variable
new Student() → creates an object


## Object Creation Process

When an object is created:

Student s1 = new Student();

Three things happen:

=> Reference variable s1 is created.
=> Memory is allocated using new.
=> Constructor is called to initialize the object.

## Reference Variable

An object variable stores the reference (address) of an object, not the actual object.

Example:

Student s1 = new Student();

Here:

s1 → reference variable
new Student() → object

## Accessing Class Members

Class variables and methods are accessed using the dot (.) operator.

Example:

s1.name = "Mehak";

s1.display();

## Multiple Objects

=> A single class can create multiple objects.

Example:

Student s1 = new Student();

Student s2 = new Student();

=> Each object has its own copy of data members.

## Memory Allocation

Objects are stored in heap memory.
Reference variables store the reference of objects.

Example:

s1  -------------> Student Object
                   (Heap Memory)
Public Class Rule
Only one public class is allowed in a single Java file.
The filename must be the same as the public class name.

Example:

File name:

Student.java

Code:

public class Student {

}

## Access Modifiers in Classes

Top-Level Class

A top-level class can be:

public
default

A top-level class cannot be:

private
protected
Inner Class

An inner class can use:

public
private
protected
default


 When an object is created, Java automatically initializes instance variables.

// Data Type  |	Default Value
// int	|        0
// float	|        0.0
// double	|        0.0
// char	|        '\u0000'
// boolean	|        false
// Object	|        null

// Since setValue() was never called, both variables remain at their default value of 0.


Important Points

=> Class is a blueprint; object is an instance of a class.
=> Objects are created using the new keyword.
=> A class contains variables and methods.
=> Objects access class members using the dot (.) operator.
=> Multiple objects can be created from one class.
=> Each object has its own separate data.
=> Objects are stored in heap memory.