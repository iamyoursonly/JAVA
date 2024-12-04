import java.util.Scanner;
public class Amitt {
    public static void main(String[] args)
 {
Scanner sc = new Scanner(System.in);

System.out.println("enter the amount and name ");
int am= sc.nextInt();

Scanner ac = new Scanner(System.in);
System.out.println("enter the name");
String a =ac.nextLine();

//System.out.println(a);
       int i=0;
do
{
System.out.println("_"+a+" "+i+"SAMOSA khayega");
          	   //  System.out.println(+i);
	i++;
}
        while(i<am);

   
    }
}