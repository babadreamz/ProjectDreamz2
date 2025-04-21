import java.util.Scanner;
public class MultTable{
public static void main (String [] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter positive integer: ");
int num = scan.nextInt();

if(num<0){
	System.out.println("This is not an integer");
	}else{
		System.out.println(num + "  Multiplication table  "  +  ":" );
			for(int count = 1; count<=12; count = count + 1){
				int times = num * count;
				System.out.println(num + "  X  " + count + " = " + times);
				}
			}
}
}