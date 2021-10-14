import java.util.Scanner;
public class Cicle{
	public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
		/*int count = 2;
		while (count<=100){
			System.out.println(count);
			count += 2;
		}*/
		int count = 0;
		int positiveCounter = 0;
		double avarege = 0;
		
		while(count<6){
			double number = scanner.nextDouble();
			if(number>0){
				positiveCounter++;
				avarege += number;
			}
			count++;
		}

		
		System.out.println(positiveCounter + " valores positivos");
		System.out.printf("%.2f%n", avarege/positiveCounter);








	}
}