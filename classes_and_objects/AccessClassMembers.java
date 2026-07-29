// Program to access class members using object

class Mobile {

    // Data members
    String brand;
    int price;

    // Method
    void showDetails() {

        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}


public class AccessClassMembers {

    public static void main(String[] args) {

        // Creating object
        Mobile m1 = new Mobile();


        // Accessing variables using object
        m1.brand = "Samsung";
        m1.price = 40000;


        // Calling method using object
        m1.showDetails();

    }
}

// Output
// Brand: Samsung
// Price: 40000