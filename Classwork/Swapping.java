import java.util.Scanner;
public class Swapping{
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);

		int a;
		int b;
		
		System.out.print("a: ");
		a = scan.nextInt();

		System.out.print("b: ");
		b = scan.nextInt();

		System.out.println("Before swapping: a = " + a + ", b = " + b);
		
		int temp = a;
		a = b;
		b = temp;

		System.out.println("After swapping: a = " + a + ", b = " + b);


	}
}