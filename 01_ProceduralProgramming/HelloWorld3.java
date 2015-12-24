/********************************************************************************
 * A Hello World Program that prompts 
 * The user to put in his name 
 * Introducing sanity checking with if-else statement
 ********************************************************************************/


public class HelloWorld3 {
	public static void main(String[] args) {
		if(args.length == 0) {
			// There is no arguemnts provided
			System.out.println("Please include your name behind");
			System.out.println("(i.e. java HelloWorld Name)");
		}
		else {
			System.out.println("Hello " + args[0]);
		}
	}
}