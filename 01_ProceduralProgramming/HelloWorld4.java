/********************************************************************************
 * A Hello World Program that prompts 
 * The user to put names
 * Multiple names allowed
 ********************************************************************************/


public class HelloWorld4 {
	public static void main(String[] args) {
		if(args.length == 0) {
			// There is no arguemnts provided
			System.out.println("Please include your name behind");
			System.out.println("(i.e. java HelloWorld Name)");
		}
		else {
			for(int i = 0; i < args.length; i++)
				System.out.println("Hello " + args[i]);
		}
	}
}