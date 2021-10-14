import java.util.Scanner;
public class SumofDigits{
	public static void main(String[]args){
		//int number = 1234;
		//int sum = 0; 
		//sum += number % 10; // 4
		//number /= 10; // 123

		//sum += number % 10; // 3
		//number /= 10;

		//sum += number % 10;
		//number /= 10;

		//sum += number % 10;
		//number /= 10;


		//System.out.println("Sum = " + sum);

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter 4 number: ");
		int userNumber = scanner.nextInt();

		int userSum = 0;
		userSum += userNumber % 10;
		userNumber /= 10;

		userSum += userNumber % 10;
		userNumber /= 10;

		userSum += userNumber % 10;
		userNumber /= 10;

		userSum += userNumber % 10;
		userNumber /= 10;


        
        
        
        
    }
}

	


