import java.util.Scanner;
public class AddDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0,rem;
        while (number != 0) {

//rem=rem%10;
//sum=sum*10+rem;
//number=number/10;


sum=sum+(number%10);
        // Add the last digit to sum
number=number/10;
         // Remove the last digit
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}
