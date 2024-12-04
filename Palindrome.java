// 5th question
import java.util.Scanner;
public class Palindrome {  
    public static void main(String[] args) {  

Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int[] array=new int[a];
for(int i=0;i<a;i++)
{
array[i]=sc.nextInt();
}
        System.out.println("Original array: ");  
        for (int i = 0; i < a; i++) {  
            System.out.print(array[i] + " ");  

        }  
        System.out.println(); 
 
        System.out.println("Array in reverse order: ");  

          int[] z = new int[a]; // Declaration and Initialization

        for (int i = a-1; i >= 0; i--) {  

            System.out.print(array[i] + " ");  
z[i] = array[a - 1 - i];

        }  
boolean areEqual=true;

for (int i = 0; i < a; i++) { if (array[i] != z[i]) { areEqual = false; break; } }

if(areEqual)
{
System.out.println("PALINDROME");
}
else
{
System.out.println("NoT A Palindrome");

}


    }  
}  