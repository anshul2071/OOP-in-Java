import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleIOExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // 1. Read an integer from the user
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();  // nextInt() reads integer
            System.out.println("You entered age: " + age);

            // 2. Read a double from the user
            System.out.print("Enter your height in meters: ");
            double height = scanner.nextDouble();  // nextDouble() reads double
            System.out.println("Your height: " + height + " meters");

            // Clear the newline left by nextInt()/nextDouble()
            scanner.nextLine();  

            // 3. Read a full line of text
            System.out.print("Enter your full name: ");
            String name = scanner.nextLine();  // nextLine() reads string with spaces
            System.out.println("Hello, " + name + "!");

        } catch (InputMismatchException e) {
            System.out.println("Invalid input type! Please enter the correct data.");
        } finally {
            scanner.close(); // Close the scanner to free resources
        }
    }
}
