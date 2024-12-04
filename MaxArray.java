// Quest 3
import java.util.Scanner;
public class MaxArray {
    public static void main(String[] args) 
{

Scanner sc= new Scanner(System.in);
int  a = sc.nextInt();
int[] array=new int[a]; 
       
for(int i=0 ;i<a;i++)
{
array[i]=sc.nextInt();
}


        int max = array[0];
        int min = array[0];

        // Iterate through the array to find max and min
        for (int i = 1; i < a; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Maximum element in the array is: " + max);
        System.out.println("Minimum element in the array is: " + min);
    }
}
