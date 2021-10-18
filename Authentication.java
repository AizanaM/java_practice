import java.util.Scanner;
public class Authentication{
	static Scanner scan;
	public static void main(String[]args){
		run();
	}
	static void run(){
		init();
		while(true){
			String operation = scan.nextLine();
			case "register";
			readData();
			break;
		case "exit":
		return;
		}
		readData();
	}
	static void init(){
		scan = new Scanner(System.in)

	}

	static void readData(){
		System.out.print("First name: ");
		String firstname = processData(scan.nextLine(), "[a-zA-Z]+",
			"First name must containts only letter of both registers");

		System.out.print("Last name: ");
		String lastName = processData(scan.nextLine(), "[a-zA-Z]+",
			"Last name must containts only letter of both registers");
		
		System.out.print("Email: ");
		String email = processData(scan.nextLine(), "[a-zA-Z0-9_]+\\@[a-z]+\\.[a-z]{3}",
			"Invalid email: example_mail@gmail.com");

	
		System.out.print("Phone number: ");
		String phonenum = processData(scan.nextLine(), "\\d{2}(-|.)\\d{2}(-|.)\\d{4}",
			"Invalid date: data format dd-mm-yyyy");

		System.out.print("Phone: ");
		String phone = processData(scan.nextLine().replace(), ""\\s"+", "\\+*\\d{12}",
			"Invalid phone number");


	}
	static String processData(String data, String regex, String errorMessage){
		if(!data.matches(regex)){
			System.out.println(errorMessage);
			System.out.println("Try again: ");
			data = scan.nextLine();

		}
		return data;
	}
}