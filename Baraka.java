import java.util.Scanner;
public class Baraka{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        double dis;

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        dis = (b * b) - (4 * a * c);
    if (a == 0 || dis < 0) {
         System.out.println
        ("Impossivel calcular");
    }
    else {
        
        System.out.printf
        ("R1 = %.5%n", (-b - Math.sqrt(dis)) / (2 * a));
        System.out.printf
        ("R1 = %.5%n", (-b + Math.sqrt(dis)) / (2 * a));
       
    }
    }
}