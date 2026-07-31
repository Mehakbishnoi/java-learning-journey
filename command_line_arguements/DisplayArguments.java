// Program to display command line arguments

public class DisplayArguments {

    public static void main(String[] args) {

        for(int i = 0; i < args.length; i++) {

            System.out.println(args[i]);

        }

    }
}

// Execution:
// javac DisplayArguments.java

// java DisplayArguments 10 20 30

// Output:
// 10
// 20
// 30