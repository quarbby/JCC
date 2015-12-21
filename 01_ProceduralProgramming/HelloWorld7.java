/********************************************************************************
 * A Hello World Program that prompts 
 * The user to put names
 * Multiple names allowed
 * Abstraction using Methods 
 * printNames method
 ********************************************************************************/

public class HelloWorld7 {
	public static void main(String[] args) {
		if(args.length == 0) {
			// There is no arguments provided
			System.out.println("Please include your name behind");
			System.out.println("(i.e. java HelloWorld Name)");
		}
		else {
			printNames(args);
		}
	}
	
	public static void printNames(String[] args) {
		int index = 0; 
		while(index < args.length) {
			System.out.println("Hello " + args[index++]);
		}
	}
}