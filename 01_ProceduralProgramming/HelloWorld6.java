/********************************************************************************
 * A Hello World Program that prompts 
 * The user to put names
 * Multiple names allowed
 * Introducing the while loop
 ********************************************************************************/

public class HelloWorld6 {
	public static void main(String[] args) {
		if(args.length == 0) {
			// There is no arguemnts provided
			System.out.println("Please include your name behind");
			System.out.println("(i.e. java HelloWorld Name)");
		}
		else {
			int index = 0;
			while(index < args.length)
				System.out.println("Hello " + args[index++]);
		}
	}
}
