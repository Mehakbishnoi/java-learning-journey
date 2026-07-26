/*
===================================================
Program: Garbage Collection Example
Concept: Garbage Collection
===================================================

Explanation:
- First object is created and referenced by v1.
- A new object is assigned to v1.
- The first object loses its reference.
- Objects without any reference become eligible for
  Garbage Collection.

Expected Output:
Second object is referenced by v1.
First object is eligible for Garbage Collection.
===================================================
*/

class Example {

}

class GarbageCollectionExample {

    public static void main(String[] args) {

        Example v1 = new Example();

        v1 = new Example();

        System.out.println("Second object is referenced by v1.");
        System.out.println("First object is eligible for Garbage Collection.");
    }
}