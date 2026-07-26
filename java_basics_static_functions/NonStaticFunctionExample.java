/*
=================================================
Program: Calling Non-Static Function
Concept: Instance Member Functions
=================================================

Explanation:
- Non-static functions belong to objects.
- They cannot be called directly from main().
- First create an object using the new keyword.
- Then call the function using the object reference.

Expected Output:
Non-Static Function
=================================================
*/

class Run {

    void fun1() {
        System.out.println("Non-Static Function");
    }
}

class NonStaticFunctionExample {

    public static void main(String[] args) {

        Run r = new Run();

        r.fun1();
    }
}