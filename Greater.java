import java.util.Scanner;
public class Greater{
public static void main (String [] args ){

Scanner scan = new Scanner (System.in);

System.out.println("Enter first integer: ");
int a = scan.nextInt();

System.out.println("Enter second integer: ");
int b = scan.nextInt();

int diff = a - b;

if(a > b){
System.out.printf("The difference is %d", diff);
}





}
}