// Program to demonstrate Integer.parseInt()

public class ParseIntExample {

    public static void main(String[] args) {

        String number = "123";

        // Converting String into primitive int
        int value = Integer.parseInt(number);

        System.out.println("Value: " + value);
        System.out.println("After adding 10: " + (value + 10));
    }
}