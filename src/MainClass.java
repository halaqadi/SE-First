/**
* The HelloWorld program implements an application that
* simply displays a string to the standard output.
*
* @author  Hala Qadi
* @version 1.1
* @since   2019-01-26 
*/

import java.util.Scanner;

public class MainClass {
	
	public static void main ( String args[] ) {
		readPrint();
	}
	
	
	/**
	 * Read the message
	 * While not "exit" or "quit" print
	 */
	public static void readPrint() {
		Print print = new Print();
		Scanner scanner = new Scanner(System.in);
		String msg;
		System.out.println("Enter a message:");
		msg = scanner.next(); //Read the message
		while (!((msg.equalsIgnoreCase("exit")) || (msg.equalsIgnoreCase("quit")))) { //While not "exit" or "quit" print
			print.printMsg(msg); //Print msg 
			System.out.println("Enter a message:"); 
			msg = scanner.next(); //Read the message
		}
	}
}
