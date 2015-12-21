# Recap of procedural programming 
Some stuff that are included: 
 *	data types*
 *	abstraction using functions
 *	conditionals
 *	loops*
 *	arrays*

*And we will still say Hello World!*

## If-Else Statements (`HelloWorld3.java`)
First interesting problem - what if the user don't know that you are required to put his/her name there?
**To urge students to attempt it on their own**.

   * Sanity checking/ Checking the length of arguments with `if-else`
   ```
   if (args.length == 0) {
       // Do something
   }
   else {
       // Do Other things
   }
   ```
   
**The Code**

```
public class HelloWorld3 {
	public static void main(String[] args) {
		if(args.length == 0) {
			// There is no arguments provided
			System.out.println("Please include your name behind");
			System.out.println("(i.e. java HelloWorld Name)");
		}
		else {
			System.out.println("Hello " + args[0]);
		}
	}
}
```

**Compiling and Running**
```
javac HelloWorld3.java
java HelloWorld3
java HelloWorld3 Andrew 
```

## Multiple Command Line Arguments (`HelloWorld4.java`)
Extending the functionality to multiple names 

**The Code**
```
public class HelloWorld4 {
	public static void main(String[] args) {
		if(args.length == 0) {
			// There is no arguements provided
			System.out.println("Please include your name behind");
			System.out.println("(i.e. java HelloWorld Name)");
		}
		else {
			for(int i = 0; i < args.length; i++)
				System.out.println("Hello " + args[i]);
		}
	}
}
```

**Compiling and Running**
```
javac HelloWorld4.java
java HelloWorld4
java HelloWorld4 Andrew Lynnette Ian Ivan Theanesh
```

## Introducing the `do-while` loop (`HelloWorld5.java`)
    * Allowing user to input multiple names 
    * Note the semi-colon after `while();`
```
do {
    // Do something
}
while (++index < args.length);
```


**The Code**
```
public class HelloWorld5 {
	public static void main(String[] args) {
		if(args.length == 0) {
			// There is no arguements provided
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
```

**Compiling and Running**
```
javac HelloWorld5.java
java HelloWorld5
java HelloWorld5 Andrew Lynnette Ian Ivan Theanesh
```

## Introducing the `while` loop (`HelloWorld6.java`)
```
while (index < args.length) {
    // Do something
}
```

**The Code**
```
public class HelloWorld6 {
	public static void main(String[] args) {
		if(args.length == 0) {
			// There is no arguements provided
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
```

**Compiling and Running**
```
javac HelloWorld6.java
java HelloWorld6
java HelloWorld6 Andrew Lynnette Ian Ivan Theanesh
```

## Abstraction using Methods (`HelloWorld7.java`)
    * The use of a public method within the class 
        `public static void printNames(String[] args)`
    * Calling the method: `printNames(args)`
    * Java method naming conventions from [Oracle](http://www.oracle.com/technetwork/java/codeconventions-135099.html)
    > Methods should be verbs, in mixed case with the first letter lowercase, with the first letter of each internal word capitalized.

**The Code**
```
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
```

**Compiling and Running**
```
javac HelloWorld7.java
java HelloWorld7
java HelloWorld7 Andrew Lynnette Ian Ivan Theanesh
```

## `For` loop and shorthand `if-else` (`PrintNumbers1.java`)
    * `For` loop
    `for (int idx = 1; idx <= 10; idx++)`
    * Modulus operator used in `(idx % 2) == 0`
    * Short hand `if-else` or terary operator
    ` a ? b : c` => evaluate expression a. If true, execute statement b, else execute c
    
    i.e. Code block `System.out.println(idx + ((idx % 2) == 0 ? " is an even number" : "is an odd number"));` can be expanded to: 
    ```
    if ((idx % 2) == 0) {
        System.out.println(idx + " is an even number");
    }
    else {
        System.out.println(idx + " is an odd number");
    }
    ```
    * Concatenation of integers and string in `System.out.println`

**The Code**
```
public class PrintNumbers1 {
    public static void main(String[] args) {
        printOneToTen();
    }
    
	public static void printOneToTen() {
		for(int idx = 1; idx <= 10; idx++) {
			System.out.println(idx + ((idx % 2) == 0 ? " is an even number" : "is an odd number"));
		}
	}
}
```

**Compiling and Running**
```
javac PrintNumbers1.java
java PrintNumbers1
```


## `Enhanced for` loop and arrays (`PrintNumbers2.java`)
    * `Enhanced for` loop [Java Docs](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html)
        `for (int i: list)`
    * Array list and initialisation
        `int[] integerList = {1,2,3,4,5,6,7,8,9,10};`


**The Code**
```
public class PrintNumbers2 {
    public static void main(String[] args) {
        int[] integerList = {1,2,3,4,5,6,7,8,9,10};
        printNumbers(integerList);
    }
    
    public static void printNumbers(int... integerList) { 
        for(int i : integerList) {
            System.out.println(i + " was entered");
        }
    }
}
```

**Compiling and Running**
```
javac PrintNumbers2.java
java PrintNumbers2
```
