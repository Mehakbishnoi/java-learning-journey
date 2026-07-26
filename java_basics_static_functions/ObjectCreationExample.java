/*
==================================================
Program: Object Creation & Default Values
Concept: Objects
==================================================

Explanation:
- Objects are created using the new keyword.
- Instance variables automatically receive default values.
- Default value of int is 0.

Expected Output:
0
0
==================================================
*/

class Student {

    int x;
    int y;
}

class ObjectCreationExample {

    public static void main(String[] args) {

        Student s = new Student();

        System.out.println(s.x);
        System.out.println(s.y);
    }
}