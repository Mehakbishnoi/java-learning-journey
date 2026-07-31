// Program to calculate average using command line arguments

public class AverageOfArguments {

    public static void main(String[] args) {

        int sum = 0;

        for(int i = 0; i < args.length; i++) {

            sum += Integer.parseInt(args[i]);

        }

        double average = (double) sum / args.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

    }
}

// Execution
// javac AverageOfArguments.java

// java AverageOfArguments 10 20 30
// Output
// Sum = 60
// Average = 20.0