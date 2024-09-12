package lab_01;

import java.util.Scanner;

public class TaskFourImplementation {

    private static final Scanner myScanner = new Scanner(System.in);

    // Declare a constant for Pi
    private static final double PI = 3.14159;

    public TaskFourImplementation() {
        // Radius of the circle
        double radius = 5.0;

        // Calculate the area using the formula
        double area = PI * radius * radius;

        // Output
        System.out.println("Task: Calculate the Area of a Circle");
        System.out.println("Radius: " + radius);
        System.out.println("Area of the circle: " + area);

        try (// Wait for user input to close
		java.util.Scanner scanner = new java.util.Scanner(System.in)) {
			System.out.println("Press Enter to continue...");
			scanner.nextLine();
		}
    }

    public static void main(String[] args) {
        new TaskFour();
    }
}