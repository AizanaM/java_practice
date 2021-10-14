import java.util.Scanner;
public class ShowCurrentTime{
	public static void main(String[]args){
		//Scanner scanner = new Scanner(System.in);

		long milliseconds = System.currentTimeMillis();
		long totalSeconds = milliseconds / 1000; // 1000 % 60
		long currentSeconds = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinutes = totalMinutes % 60;
		long totalHours = totalMinutes /60;
		long currentHours = totalHours % 24 +6L;
		System.out.printf("Current time is %d:%d:%d%n",
			currentHours, 
			currentMinutes, 
			currentSeconds);

		long totalDays = totalHours / 24;
		long currentDays = totalDays % 31;
		long totalMonth = totalDays / 31;
		long currentMonth = totalMonth % 12;
		long totalYears = totalMonth / 12;
		
		System.out.printf("Current data is %d:%d:%d",
			currentDays, 
			currentMonth, 
			totalYears);



	}
}