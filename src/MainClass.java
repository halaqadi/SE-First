import java.util.Scanner;

public class MainClass {
	
	public static void main ( String args[] ) {
		
		Print print = new Print();
		Scanner scanner = new Scanner(System.in);
		String msg;
		
		System.out.println("Enter a message:");
		msg = scanner.next();
		while (!((msg.equalsIgnoreCase("exit")) || (msg.equalsIgnoreCase("quit")))) {
			print.printMsg(msg);
			System.out.println("Enter a message:");
			msg = scanner.next();
		}
	}
}
