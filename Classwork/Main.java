import java.util.Scanner;
public class Main{
	public static void main (String[]args){
		
		Scanner scan = new Scanner(System.in);
		


		System.out.print("a: ");
		int a = scan.nextInt();

		System.out.print("b: ");
		int b = scan.nextInt();

		System.out.println(a + " + " + b + " = " + (a+b));
		System.out.println(a + " - " + b +  " = " + (a-b));
		System.out.println(a + " * " + b +  " = " + (a*b));
		System.out.println(a + " / " + b +  " = " + (a/b));
		System.out.println(a + " % " + b +  " = " + (a%b));

	}
}