import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner
 System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        // Calculate the sum
        double sum = num1 + num2;
        
        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        
        // Close the scanner object
        scanner.close();
    }
}
