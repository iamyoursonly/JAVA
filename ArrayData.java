import java.util.Scanner;

public class ArrayData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for integer array
        System.out.print("Enter the number of integers: ");
        int numIntegers = scanner.nextInt();
        int[] intArray = new int[numIntegers];
        System.out.println("Enter the integers:");
        for (int i = 0; i < numIntegers; i++) {
            intArray[i] = scanner.nextInt();
        }
        scanner.nextLine(); // Consume the newline character

        // Taking input for string array
        System.out.print("Enter the number of strings: ");
        int numStrings = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        String[] strbvArray = new String[numStrings];
        System.out.println("Enter the strings:");
        for (int i = 0; i < numStrings; i++) {
            strArray[i] = scanner.nextLine();
        }

        // Displaying the integer array
        System.out.println("Integer array:");
        for (int i : intArray) {
            System.out.println(i);
        }

        // Displaying the string array
        System.out.println("String array:");
        for (String s : strArray) 
-{
            System.out.println(s);
        }
    }
}
