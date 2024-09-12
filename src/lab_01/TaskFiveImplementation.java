package lab_01;

public class TaskFiveImplementation {

    public TaskFiveImplementation() {
        /*
        Task five: Data Types
        */

        // Variables
        String firstName = "Emily";
        long cityPopulation = 42088;
        double temperatureCelsius = 23.5;
        boolean isStudent = true;

        // Output
        System.out.println("Task 5: Data Types");
        System.out.println("First Name: " + firstName);
        System.out.println("City Population: " + cityPopulation);
        System.out.println("Temperature in Celsius: " + temperatureCelsius);
        System.out.println("Is Student: " + isStudent);

        // Wait for user input to close
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            System.out.println("Press Enter to continue...");
            scanner.nextLine();
        }
    }

    public static void main(String[] args) {
        new TaskFiveImplementation(); // Corrected to instantiate TaskFiveImplementation
    }
}