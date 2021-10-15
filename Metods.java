import java.util.Scanner;
public class Metods{
	public static void main(String[]args){
	
	Scanner scan = new Scanner(System.in);

	while (scan.hasNext()){
		int a = scan.nextInt(); 50
		int b = scan.nextInt(); 70
		int max = findMax(a, b);
		print(max);

		}
	}
	public static int findMax(int a, int b){
		if(a>=b){
			return a;
		}
			return b;
	}

	public static void print(int res){
		System.out.println("result: " + res);
	}

} 