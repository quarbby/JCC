# Java Class Library
    * [Scanner](https://docs.oracle.com/javase/tutorial/essential/io/scanning.html)
    * [Math](https://docs.oracle.com/javase/7/docs/api/java/lang/Math.html)
    * [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)
    
    * Import Statements
        - Good practice to only import what you need: `import java.util.Scanner` imports only the `Scanner` class
        - Eclipse/IDEs will usually prompt you to import what you didn't
        - Importing all from a library:  `import java.util.*`
        
    * Initialising abstract datatypes from the imported libraries
    `<Abstract Datatype> <Your Variable Name> = "new" <Constructor>(<Parameters>);`
    
    * Using `Scanner` class 
        - Import
        `import java.util.Scanner;`
        - Reading from System.in
        ` Scanner scanner = new Scanner(System.in);`
        - Get next integer
        `int first = scanner.nextInt();`
        *How to read doubles/ strings etc?*
        
    * Using `Math` class 
        - Import
        `import java.lang.Math;`
        - Min/ Max: `Math.max(first, second)`
        - Other Math functions: pow... 
        
     * Using `String` class
        - Import
        `import java.lang.String;`
        - Creating a new string
        `String myString = new String("This is just a random string");`
        - Length of string
        `myString.length()`
        - Character at index
        `myString.charAt(index)`
        
**The Code**
```
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
```

**Compiling and Running**
```
javac JavaClassLibrary.java
java JavaClassLibrary
```