import java.util.Scanner;

public class Comp {
    public static void main(String[] args) {
        Scanner amit = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = amit.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = amit.nextInt();

if(num1<num2)
{
        System.out.println("num1 is smaller" + num1);
}
else if(num2<num1)
{
  System.out.println("num2 is smaller and" + num1 + " is greater");
}
else 
{
System.out.println("Both are Equal");

}


    }
}
