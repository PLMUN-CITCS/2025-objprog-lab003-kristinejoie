import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args) {
        
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int userInt = input.nextInt();

        // Prompt the user to enter a decimal number (double)
        System.out.print("Enter a decimal number: ");
        double userDouble = input.nextDouble();

        // Consume the leftover newline character
        input.nextLine(); 

        // Prompt the user to enter a word or sentence
        System.out.print("Enter a word or sentence: ");
        String userString = input.nextLine();

        // Output the integer value with formatting
        System.out.printf("Your integer: %d%n", userInt);

        // Output the decimal value with formatting (2 decimal places)
        System.out.printf("Your decimal number: %.2f%n", userDouble);

        // Output the string value with formatting
        System.out.printf("Your string: %s%n", userString);

        // Close the scanner
        input.close();
    }
}