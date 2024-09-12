package lab_01;

import java.util.Scanner;

public class TaskThreeImplementation {

    // Constructor
    public TaskThreeImplementation() {
        /*
         Task three: Output Statement
         */

        // Variables
        int age = 25;
        double heightInMeters = 1.6256;
        char favoriteLetter = 'E';
        boolean likesProgramming = true;

        // Output
        System.out.println("Task 3: Variables and User Input");
        System.out.println("Age: " + age);
        System.out.println("Height in meters: " + heightInMeters);
        System.out.println("Favorite letter: " + favoriteLetter);
        System.out.println("Likes programming: " + likesProgramming);

        // Wait for user input to close
        System.out.println("Press Enter to continue...");
        try (Scanner scanner = new Scanner(System.in)) {
            scanner.nextLine(); // Wait for user input to proceed
        } catch (Exception e) {
            System.out.println("An error occurred while waiting for input.");
        }
    }

    // Main method to test the class independently
    public static void main(String[] args) {
        new TaskThreeImplementation(); // Creates an instance to execute the constructor
    }
}
