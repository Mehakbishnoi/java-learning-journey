# Wrapper Classes in Java

## What are Wrapper Classes?

Wrapper classes are predefined classes provided by Java that **wrap primitive data types into objects**.

Java is primarily an object-oriented programming language, but primitive data types (`int`, `char`, `double`, etc.) are **not objects**. To allow primitive values to be used where objects are required, Java provides a corresponding wrapper class for every primitive data type.

For example:

- Primitive: `int`
- Wrapper Class: `Integer`

Instead of storing only a primitive value, a wrapper class stores that value inside an object.

---

## Why are Wrapper Classes Needed?

Many Java libraries and frameworks work only with objects.

For example:

- Collections Framework (`ArrayList`, `LinkedList`, `HashMap`)
- Generics
- Java Streams
- Reflection API

Since primitive data types cannot be stored directly in these classes, wrapper classes are used.

Example:

❌ Invalid

```java
ArrayList<int> list = new ArrayList<>();
```

✔ Valid

```java
ArrayList<Integer> list = new ArrayList<>();
```

---

# Primitive Data Types vs Wrapper Classes

| Primitive Data Type | Wrapper Class |
|---------------------|---------------|
| `byte` | `Byte` |
| `short` | `Short` |
| `int` | `Integer` |
| `long` | `Long` |
| `float` | `Float` |
| `double` | `Double` |
| `char` | `Character` |
| `boolean` | `Boolean` |

---

# Primitive vs Wrapper Class

| Primitive Data Type | Wrapper Class |
|---------------------|---------------|
| Stores only a value | Stores the value as an object |
| Faster | Slightly slower |
| Less memory | More memory |
| Cannot call methods | Can call methods |
| Cannot be stored directly in Collections | Can be stored in Collections |
| Default value depends on declaration | Can be `null` |

---

# Why Wrapper Classes are Important?

Wrapper classes provide several useful features:

- Convert primitive values into objects.
- Convert objects back into primitive values.
- Convert Strings into numeric values.
- Convert numeric values into Strings.
- Provide many utility methods.
- Work with Collections Framework.
- Support Autoboxing and Unboxing.
- Used by Generics.

---

# Common Methods of Integer Wrapper Class

| Method | Description |
|---------|-------------|
| `parseInt()` | Converts String to primitive `int` |
| `valueOf()` | Converts String to Integer object |
| `intValue()` | Converts Integer object to primitive `int` |
| `toString()` | Converts Integer to String |
| `compare()` | Compares two integers |
| `max()` | Returns maximum value |
| `min()` | Returns minimum value |

---

# Integer.parseInt()

## Definition

`Integer.parseInt()` converts a **String** into a primitive `int`.

### Syntax

```java
int variable = Integer.parseInt(String);
```

Example

```java
int age = Integer.parseInt("20");

System.out.println(age);
```

Output

```text
20
```

---

## Internal Working

```
String
 "20"
   │
   ▼
Integer.parseInt()
   │
   ▼
Primitive int
   │
   ▼
20
```

---

## Use Cases

Used when

- Reading input
- Command Line Arguments
- Scanner (String input)
- Reading numbers from files
- Reading numbers from databases

Example

```java
String marks = "95";

int m = Integer.parseInt(marks);

System.out.println(m + 5);
```

Output

```
100
```

---

## Invalid Input

```java
Integer.parseInt("ABC");
```

Output

```
NumberFormatException
```

Because `"ABC"` is not a valid integer.

---

# Integer.valueOf()

## Definition

`valueOf()` converts a String into an **Integer object**.

### Syntax

```java
Integer object = Integer.valueOf(String);
```

Example

```java
Integer num = Integer.valueOf("100");

System.out.println(num);
```

Output

```
100
```

---

## Internal Working

```
String
"100"
   │
   ▼
Integer.valueOf()
   │
   ▼
Integer Object
```

---

## Why use valueOf()?

It is useful whenever an object is required.

Example

```java
ArrayList<Integer> list = new ArrayList<>();

list.add(Integer.valueOf("50"));
```

---

# Difference Between parseInt() and valueOf()

| Integer.parseInt() | Integer.valueOf() |
|--------------------|-------------------|
| Returns primitive `int` | Returns `Integer` object |
| Return type is `int` | Return type is `Integer` |
| No object is created | Creates/returns an Integer object |
| Slightly faster | Slightly slower |
| Used for arithmetic operations | Used when an object is required |

Example

```java
int x = Integer.parseInt("10");

Integer y = Integer.valueOf("10");
```

---

# Integer.intValue()

## Definition

`intValue()` converts an Integer object into a primitive `int`.

### Syntax

```java
int variable = object.intValue();
```

Example

```java
Integer x = Integer.valueOf("150");

int y = x.intValue();

System.out.println(y);
```

Output

```
150
```

---

## Internal Working

```
Integer Object
      │
      ▼
intValue()
      │
      ▼
Primitive int
```

---

# Static Methods

Both

- `Integer.parseInt()`
- `Integer.valueOf()`

are **static methods**.

Static methods belong to the class rather than an object.

Therefore they are called using the class name.

Correct

```java
Integer.parseInt("20");

Integer.valueOf("20");
```

Incorrect

```java
Integer obj = new Integer(20);

obj.parseInt("20");
```

---

# Wrapper Class Objects

Creating an Integer object

```java
Integer number = Integer.valueOf("123");
```

Accessing primitive value

```java
int x = number.intValue();
```

---

# Real-Life Example

Suppose a user enters age through a text field.

Input

```
"21"
```

This is stored as a String.

To perform calculations,

```java
String age = "21";

int actualAge = Integer.parseInt(age);

System.out.println(actualAge + 1);
```

Output

```
22
```

---

# Advantages of Wrapper Classes

- Supports Object-Oriented Programming.
- Required by Collections Framework.
- Supports Generics.
- Provides useful utility methods.
- Simplifies type conversion.
- Supports Autoboxing and Unboxing.

---

# Limitations

- Uses more memory than primitive types.
- Slightly slower because objects are created.
- Boxing and unboxing add a small performance overhead.

---

# Frequently Asked Interview Questions

### 1. What is a wrapper class?

A wrapper class converts a primitive data type into an object.

---

### 2. Why are wrapper classes used?

Because many Java APIs work only with objects.

---

### 3. What is the difference between `parseInt()` and `valueOf()`?

`parseInt()` returns a primitive `int`, whereas `valueOf()` returns an `Integer` object.

---

### 4. What does `intValue()` do?

It converts an Integer object back into a primitive `int`.

---

### 5. Can wrapper classes store `null`?

Yes.

Example

```java
Integer x = null;
```

Primitive variables cannot store `null`.

---

# Summary

- Every primitive type has a wrapper class.
- Wrapper classes convert primitive values into objects.
- `parseInt()` converts String → primitive `int`.
- `valueOf()` converts String → `Integer` object.
- `intValue()` converts `Integer` object → primitive `int`.
- Wrapper classes are widely used with Collections, Generics, Streams, and APIs that require objects.