import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner amit = new Scanner(System.in);
System.out.print("Enter your name ");
String name = amit.nextLine(); 
System.out.println("your name is " +name);


        System.out.print("Enter the first integer: ");
        int num1 = amit.next();
//if we write only nextInt(); then all types of input can be taken
        System.out.print("Enter the second integer: ");
        int num2 = amit.nextInt();

        int sum = num1 + num2;

        System.out.println("Amit the sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
