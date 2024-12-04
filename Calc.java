import java.util.Scanner;
class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

       // System.out.println("Enter an operator (+, -, *, /): ");
System.out.println("PRESS 1 for ADDITION");
System.out.println("PRESS 2 for SUBSTRACTION");
System.out.println("PRESS 3 for MULTIPLICATIO");
System.out.println("PRESS 4 for DIVIDE");
System.out.println("PRESS 5 for ALL");
        char operator = scanner.next().charAt(0);

        double result;
   double resul;
   double resu;
   double res;


        switch (operator) {
            case '1':
                result = num1 + num2;
System.out.println("The result is: " + result);
                break;
            case '2':
                resul = num1 - num2;
System.out.println("The result is: " + resul);
                break;
            case '3':
                resu = num1 * num2;
System.out.println("The result is: " + resu);
                break;
            case '4':
                if (num2 != 0) {
                    res = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
System.out.println("The result is: " + res);
                    return;
                }
                break;

 default:
                System.out.println("Invalid operator!");
                return;

        }
        
    }
}
