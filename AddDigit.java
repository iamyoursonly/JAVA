import java.util.Scanner;

public class AddDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
        int inp = scanner.nextInt();

int f,l,b,sum;
f=inp/100;
l=inp%10;
b=(inp/10)%10;
   sum = f+l+b;
System.out.print("sum"+sum);
}
}