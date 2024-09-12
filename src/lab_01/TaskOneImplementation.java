package lab_01;

import java.util.Scanner;

public class TaskOneImplementation {


    // Constructor
    public TaskOneImplementation() {
        /*
         Task one: Output Statement
         */
        // Name and favorite color
        String name = "Emily";
        String favoriteColor = "Blue";

        // Current year
        final int currentYear = 2024;

        // Output
        System.out.println("Name: " + name);
        System.out.println("Favorite Color: " + favoriteColor);
        System.out.println("Current Year: " + currentYear);

        // Wait for user input to close (similar to Console.ReadLine() in C#)
        myScanner.nextLine();
    }

    // Method to call the task from a main class
    public void execute() {
        // Task logic is already in the constructor
        // If you need additional functionality, implement it here
    }

    public static void main(String[] args) {
        new TaskOneImplementation(); // Creates an instance to execute the constructor
    }
}
