// Program to demonstrate multiple objects

class Student {

    String name;
    int rollNo;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println();
    }
}

public class MultipleObjects {

    public static void main(String[] args) {

        // First object
        Student s1 = new Student();

        s1.name = "Rahul";
        s1.rollNo = 101;


        // Second object
        Student s2 = new Student();

        s2.name = "Amit";
        s2.rollNo = 102;


        // Calling methods
        s1.display();
        s2.display();
    }
}


// Output
// Name: Rahul
// Roll No: 101

// Name: Amit
// Roll No: 102