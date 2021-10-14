import java.util.Scanner;
public class Cicle1{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int number;
        int counter = 0;
        int sum = 0;

        while(true){
            number = scanner.nextInt();
            if(number==0){
                break;
            }
            counter++;
            sum += number;
        }
        System.out.printf("Total: %d", sum/counter );

    }
}