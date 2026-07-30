// Program to demonstrate intValue()

public class IntValueExample {

    public static void main(String[] args) {

        // Creating Integer object
        Integer number = Integer.valueOf(500);

        // Converting object into primitive int
        int value = number.intValue();

        System.out.println("Primitive value: " + value);

    }
}