/*
===========================================
Program: Static Function Example
Concept: Static Functions
===========================================

Explanation:
- A static function belongs to the class.
- Static functions can be called directly inside another static function.
- Since main() is static, it can directly call fun1() and fun2().

Expected Output:
C
A
B
===========================================
*/

class StaticFunctionExample {

    static void fun1() {
        System.out.println("A");
    }

    static void fun2() {
        System.out.println("B");
    }

    public static void main(String[] args) {

        System.out.println("C");

        fun1();
        fun2();
    }
}