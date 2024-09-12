package lab_01;

import java.util.Scanner;

public class TaskMenu {

    static final Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean showMenu = true;

        while (showMenu) {
            showMenu = mainMenu();
        }
    }

    private static boolean mainMenu() {
        System.out.println("Main Menu");
        System.out.println("1. Task One");
        System.out.println("2. Task Three");
        System.out.println("3. Task Four");
        System.out.println("4. Task Five");
        System.out.println("5. Exit");
        System.out.print("\nSelect an option: ");

        String userInput = myScanner.nextLine();

        switch (userInput) {
            case "1":
                TaskOne taskOne = new TaskOne();
                taskOne.execute();
                //new TaskOneImplementation.execute();
                break;
            case "2":
                TaskThree taskThree = new TaskThree();
                taskThree.execute();
                break;
            case "3":
                TaskFour taskFour = new TaskFour();
                taskFour.execute();
                break;
            case "4":
                TaskFive taskFive = new TaskFive();
                taskFive.execute();
                break;
            case "5":
                exit();
                return false;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                return true;
        }
        return true;
    }

    private static void exit() {
        System.out.println("Exiting the program...");
        myScanner.nextLine(); // Pause for user to press a key
    }
}

class TaskOne {
    public void execute() {
        System.out.println("You selected Task One.");
        TaskMenu.myScanner.nextLine(); // Pause for user to press a key
    }
}

class TaskThree {
    public void execute() {
        System.out.println("You selected Task Three.");
        TaskMenu.myScanner.nextLine(); // Pause for user to press a key
    }
}

class TaskFour {
    public void execute() {
        System.out.println("You selected Task Four.");
        TaskMenu.myScanner.nextLine(); // Pause for user to press a key
    }
}

class TaskFive {
    public void execute() {
        System.out.println("You selected Task Five.");
        TaskMenu.myScanner.nextLine(); // Pause for user to press a key
    }
}
