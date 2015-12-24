/********************************************************************************
 * A Hello World Program that prompts 
 * The user to put names
 * Multiple names allowed
 * Introducing the do-while loop
 ********************************************************************************/


public class HelloWorld5 {
	public static void main(String[] args) {
		if(args.length == 0) {
			// There is no arguemnts provided
			System.out.println("Please include your name behind");
			System.out.println("(i.e. java HelloWorld Name)");
		}
		else {
			int index = 0;
			do {
				System.out.println("Hello " + args[index]);
			}
			while(++index < args.length);
		}
	}
}