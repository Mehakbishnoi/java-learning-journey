# Command Line Arguments in Java

## Definition

Command Line Arguments are values that are passed to a Java program when it is executed from the command line.

These values are received by the `main()` method and stored inside the String array:

```java
String[] args
```

The `args` array contains all the arguments provided during program execution.

---

# Syntax of main() Method

```java
public static void main(String[] args)
{
    // program code
}
```

Here:

- `public` → Allows JVM to access the main method.
- `static` → Allows execution without creating an object.
- `void` → Main method does not return any value.
- `String[] args` → Stores command line arguments.

---

# Example Program

```java
// Program to display command line arguments

public class CLA {

    public static void main(String[] args) {

        for(int i = 0; i < args.length; i++) {

            System.out.println(args[i]);

        }

    }
}
```

---

# Execution

Compile the program:

```bash
javac CLA.java
```

Run the program with arguments:

```bash
java CLA 10 20 30
```

---

# Output

```text
10
20
30
```

---

# Internal Representation

When we execute:

```bash
java CLA 10 20 30
```

The JVM stores values in the `args` array:

```
args

+------+------+------+
| "10" | "20" | "30" |
+------+------+------+
   0      1      2
```

Important:

- Array indexing starts from `0`.
- All command line arguments are stored as **String values**.

---

# Important Point

Even if we pass numbers:

```bash
java CLA 10 20 30
```

Java stores them as:

```text
"10"
"20"
"30"
```

They are not stored as integers.

---

# Converting Command Line Arguments into Integers

Since command line arguments are stored as Strings, we need to convert them before performing mathematical operations.

For conversion, we use:

```java
Integer.parseInt()
```

Syntax:

```java
int number = Integer.parseInt(args[index]);
```

Example:

```java
int a = Integer.parseInt(args[0]);
```

---

# Without Conversion

Example:

```java
String a = "10";
String b = "20";

System.out.println(a + b);
```

Output:

```text
1020
```

Because String values are concatenated.

---

# After Conversion

Example:

```java
int a = Integer.parseInt("10");
int b = Integer.parseInt("20");

System.out.println(a + b);
```

Output:

```text
30
```

Because values are converted into integers.

---

# Program to Calculate Sum and Average

```java
// Program to calculate sum and average using command line arguments

public class CLA {

    public static void main(String[] args) {

        int sum = 0;

        for(int i = 0; i < args.length; i++) {

            sum += Integer.parseInt(args[i]);

        }

        double average = (double) sum / args.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

    }
}
```

---

# Execution

Compile:

```bash
javac CLA.java
```

Run:

```bash
java CLA 10 20 30
```

---

# Output

```text
Sum = 60
Average = 20.0
```

---

# Advantages of Command Line Arguments

- Allows users to provide input during program execution.
- Avoids changing the source code for different inputs.
- Useful for automation and scripting.
- Used in configuration-based programs.

---

# Limitations

- Input is always received as String.
- Conversion is required for numeric operations.
- Incorrect input can cause exceptions like `NumberFormatException`.

---

# Common Interview Questions

### 1. What are command line arguments?

Command line arguments are values passed to a program during execution.

---

### 2. Where are command line arguments stored?

They are stored inside the `String[] args` array of the main method.

---

### 3. What is the datatype of command line arguments?

The datatype is `String`.

---

### 4. How do we convert command line arguments into integers?

Using:

```java
Integer.parseInt()
```

---

### 5. What happens if we add two String arguments?

They are concatenated instead of added mathematically.

Example:

```
"10" + "20" = "1020"
```

---

# Key Points

- Command line arguments are passed during program execution.
- They are stored in `String[] args`.
- Every argument is treated as a String.
- `Integer.parseInt()` converts String values into integers.
- Arguments are accessed using array indexing.
- The first argument is stored at index `0`.