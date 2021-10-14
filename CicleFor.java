import java.util.Scanner;
public class CicleFor{
    public static void main(String[]args){
        
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        int percent;
        double salaryWthRate;
        
        if(salary>0 && salary<=400){
            percent = 15;
            salaryWthRate = (salary*percent)/100;
            salary += salaryWthRate;
        }
        else if(salary>=400.01 && salary<800){
            percent = 12;
            salaryWthRate = (salary*percent)/100;
            salary += salaryWthRate;
        }
        else if(salary>=800.01 && salary<1200){
            percent = 10;
            salaryWthRate = (salary*percent)/100;
            salary += salaryWthRate;
        }
        else if(salary>=1200.01 && salary<2000){
            percent = 7;
            salaryWthRate = (salary*percent)/100;
            salary += salaryWthRate;
        }
        else if(salary>2000){
            percent = 4;
            salaryWthRate = (salary*percent)/100;
            salary += salaryWthRate;
        }
        
        System.out.printf("Novo salario: %.2f%n", salary);
        System.out.printf("Reajuste ganho: %.2f%n", salaryWthRate);
        System.out.println("Em percentual: " + percent + "%");
    }
}

