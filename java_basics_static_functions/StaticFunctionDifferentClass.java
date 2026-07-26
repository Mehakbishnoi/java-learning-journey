/*
==================================================
Program: Calling Static Function from Another Class
Concept: Static Functions
==================================================

Explanation:
- Two different classes can have methods with the same name.
- Calling fun1() executes the current class method.
- Calling Area.fun1() executes the Area class method.

Expected Output:
A
My Name
==================================================
*/

class Area {

    static void fun1() {
        System.out.println("My Name");
    }
}

class StaticFunctionDifferentClass {

    static void fun1() {
        System.out.println("A");
    }

    public static void main(String[] args) {

        fun1();

        Area.fun1();
    }
}