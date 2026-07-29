class Nokia {

    private int mike;
    private int cam;

    void setValue() {
        mike = 2;
        cam = 40;
    }

    void display() {
        System.out.println("Microphones = " + mike);
        System.out.println("Camera MP = " + cam);
    }
}

public class ClassesAndObjects {

    public static void main(String[] args) {

        Nokia n1 = new Nokia();

        n1.setValue();
        n1.display();
    }
}

//Output
// Microphones = 2
// Camera MP = 40
// What happens if display() is called first?
// Nokia n1 = new Nokia();

// n1.display();

// Output

// Microphones = 0
// Camera MP = 0

// Why?

// When an object is created, Java automatically initializes instance variables.

// Data Type  |	Default Value
// int	|        0
// float	|        0.0
// double	|        0.0
// char	|        '\u0000'
// boolean	|        false
// Object	|        null

// Since setValue() was never called, both variables remain at their default value of 0.