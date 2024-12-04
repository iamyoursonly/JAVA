import java.util.Scanner;

public class Cac {
    public static void main(String[] args)
 {
        Scanner scanner = new Scanner(System.in);
	System.out.print("input your first number: ");
        double num1 = scanner.nextDouble();
	System.out.print("input your second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        double result;

        
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result of addition: " + result);
               break;
            case 2:
                result = num1 - num2;
                System.out.println("Result of subtraction: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result of multiplication: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result of division: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please select a number between 1 and 4.");
        }

        
        System.out.print("\nDo you want to see all operations performed? (yes/no): ");
        String response = scanner.next().toLowerCase();

        if (response.equals("yes") || response.equals("y")) {
            System.out.println("\nPerforming all operations:");
            System.out.println("Addition: " + (num1 + num2));
            System.out.println("Subtraction: " + (num1 - num2));
            System.out.println("Multiplication: " + (num1 * num2));
            if (num2 != 0) {
                System.out.println("Division: " + (num1 / num2));
            } else {
                System.out.println("Division: Error (division by zero is not allowed).");
            }
        } else {
            System.out.println("All operations skipped.");
        }

        scanner.close();
    }
}