import java.util.Scanner;


public class Condition{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        String inputOrder = a + "/n" + b + "/n" + c;

        if (a > b){
        	int t = a;
        	a = b;
        	b = t;
        }
        if (a > c){
        	int t = a;
        	a = c;
        	c = t;
        }
        if (b > c){
        	int t = b;
        	b = c;
        	c = t;
        }

        System.out.println(a);	
        System.out.println(b);
        System.out.println(c);

        System.out.println("/n" + inputOrder);

    }
}