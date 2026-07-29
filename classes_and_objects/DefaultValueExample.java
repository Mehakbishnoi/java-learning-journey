// Program to demonstrate default values of variables

class Demo {

    int number;
    String name;
    boolean status;


    void display() {

        System.out.println(number);
        System.out.println(name);
        System.out.println(status);

    }
}


public class DefaultValueExample {

    public static void main(String[] args) {

        Demo d1 = new Demo();

        d1.display();

    }
}

// Output
// 0
// null
// false