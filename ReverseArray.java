// q2 
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int a= sc.nextInt();
int [] b=new int[a];
for(int i=0;i<a;i++)
{
b[i]=sc.nextInt();

}

int n=a;
 // Print original array
        System.out.println("Original array:");
        for (int i = 0; i < a; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

        // Reverse the array
        for (int i = 0; i < a / 2; i++) {
            int temp = b[i];
            b[i] = b[n - 1 - i];
            b[n - 1 - i] = temp;
        }

        // Print reversed array
        System.out.println("Reversed array:");
        for (int i = 0; i < a; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
