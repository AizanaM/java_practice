import java.util.Scanner;
public class Veriable{
	public static void main(String[]args){
		//String name = "Jonh Doe";
		//int age = 30;
		//char gender = 'M';
		//boolean isStudent = true;
		//long inn = 123456781234578L;
		//float height = 1.74f;
		//double weight = 70.6;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Fullname: ");
		String fullname = scan.nextLine();
		
		System.out.print("Age: ");
		int age = scan.nextInt();
		
		System.out.print("Inn: ");
		long inn = scan.nextLong();
		
		System.out.print("Height: ");
		float height = scan.nextLong();
		
		System.out.print("Weight: ");
		double weight = scan.nextDouble();
		
		System.out.print("Are you student(true/false): ");
		boolean isStudent = scan.nextBoolean();
		
		

	}
}