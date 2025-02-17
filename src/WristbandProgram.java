import java.util.Scanner;

public class WristbandProgram {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check if the user is 21 or older
        if (age >= 21) {
            // Display message for receiving a wristband
            System.out.println("You get a wristband.");
        }
        // No output if the user is under 21
    }
}
