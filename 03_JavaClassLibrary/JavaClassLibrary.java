/********************************************************************************
 *	Java class library
 *	Scanner
 *	Math
 *	String (if time permits)
 ********************************************************************************/

import java.util.Scanner;
import java.lang.Math;
import java.lang.String;

public class JavaClassLibrary {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int first = scanner.nextInt();
        System.out.println();
        System.out.print("Enter your second number: ");
        int second = scanner.nextInt();
        System.out.println();
        int max = Math.max(first, second);
        System.out.println("Max of your two numbers is: " + max);
        int min = Math.min(first, second);
        System.out.println("Min of your two numbers is: " + min);

        String myString = new String("This is just a random string");
        System.out.println("First letter of this string is: " + myString.charAt(0));
        System.out.println("The last letter of this string is " + myString.charAt(myString.length()-1));
        System.out.println("The middle letter of this string is: " + (myString.charAt(myString.length()/2+1)));
    
    }
}
