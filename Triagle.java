import java.util.Scanner;
public class Triagle{
	public static void main(String[]args){
	
	Scanner scanner = new Scanner(System.in);
	double a = scanner.nextDouble();
	double d = scanner.nextDouble();
	double c = scanner.nextDouble();

	if(a<d){
		double t = a;
		a = d;
		d = t;		 
	}
	if(a<c){
		double t = a;
		a = c;
		c = t;
	}
	if(d<c){
		double t = d;
		d = c;
		c = t;
	}
		
	if (a<d+c){
		System.out.printf("Perimetro = %.1f%n", a+d+c);
	}
	else {
		System.out.printf("Area = %.1f%n", (a+d)/2*c); 
	}

	} 
}