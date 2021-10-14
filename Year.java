import java.util.Scanner;

public class Year{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		 
		System.out.print("Month: ");
		int month = scanner.nextInt();
	  	
		System.out.print("Year: ");
		int year = scanner.nextInt();
		boolean isLeap = (year % 4) == 0 && (year % 100) != 0  || (year % 400) == 0;

		int day;
		switch(month){
			case 1: 
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			 day = 31;
			 break;
			case 4:
			case 6:
			case 9:
			case 11:
			 day = 30;
			break;
			case 2:
			 day = isLeap ? 28 : 29;
			 break;
			default:
			day = -1;
		}

 	if (day == -1){
 		System.out.println("Invalid month");
 	} 
 	else {
 		System.out.println("Days = " + day);
 	}
 

	}
}