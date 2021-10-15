import java.util.Scanner;
public class Metod{
	public static void main(String[]args){
	findSum(10, 20);
	findSum(25, 33);
	findSum(45, 74);
	}
	public static void findSum(int a, int b){
	int sum = 0;
	for (int i =0; i<b; i++){
		sum+=i;
	}
	System.out.printf("%d + %d = %d%n", a, b, sum);
}

}