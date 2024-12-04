// Q4 QUest
import java.util.Scanner;
public class EvenOddArray {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int[] array=new int[a];
for(int i=0;i<a;i++)
{
array[i]=sc.nextInt();
}
       // int[] array = {3, 5, 7, 2, 8, -1, 4, 10, 12}; // Example array

        System.out.println("Even numbers in the array:");
        for (int i = 0; i < a; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.println("\n Odd numbers in the array:");
        for (int i = 0; i < a; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
