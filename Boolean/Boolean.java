
import java.util.Scanner;
public class Boolean{
	public static void main (String []args){
		Scanner scanner = new Scanner(System.in);

		int y = (int) (Math.random()*10);
		int x = (int) (Math.random()*10);

		System.out.printf("%d + %d = ", x , y);
		int answer = scanner.nextInt();

		boolean correct = y + x == answer;
		//System.out.printf("%d + %d is %d %b", x, y, answer, correct);

		String answerCorrect = String.format("%d + %d is %d? %b", x, y, answer, correct);
		String answerInCorrect = String.format("%d + %d is %d? %b. Correct answer is %b", x, y, answer, correct, (x+y));
		System.out.println(correct ? answerCorrect : answerInCorrect);




	}
}