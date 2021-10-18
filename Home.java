import java.util.Scanner;
public class Home{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        double a, b, c, a2, b2, c2;

        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();

        a2 = a*a;
        b2 = b*b;
        c2 = c*c;
        
        if(a>=b+c){
            System.out.println("NAO FORMA TRIANGULO");
        }
        else if(a2==b2+c2){
            System.out.println("TRIANGULO RETANGULO");
        }
        else if(a2>b2+c2){
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        else if(a2<b2+c2){
             System.out.println("TRIANGULO ACUTANGULO");
        }
        else if((a==b)&(b==c)){
             System.out.println("TRIANGULO EQUILATERO");
        }
        else if((b==c)&(b==a)&(a==c)){
             System.out.println("TRIANGULO ISOSCELES");
        }

    }
}