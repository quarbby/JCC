# The Classic Hello World!
 
## The Simplest Hello World (`HelloWorld1.java`)
 *	Structure of a Hello World program
    * Create a class
    * Create a main method
    * Semi-colons
 
 *  Structure of comments 
 ```
 /********************************************************************************
 * This is a block comment
 ********************************************************************************/
 
 ```
 
 ```
 // This is a single line comment
 ```
 
 *	`main` as a static method of a public class. (static, class and public to be explained later)
 ```
 public static void main(String[] args) {
     }
 ```
 
 *	Naming of Source Files (`.java`)
 *	`System.out.println` to be used to introduce packages and libraries briefly.
    * [Java docs](https://docs.oracle.com/javase/tutorial/essential/io/formatting.html)(with other formatting methods)
 ```
 int i = 2;
 
 System.out.println("Hello World!");
 System.out.println("Hello" + "World!");
 System.out.println("The value of i is: " + i);
 ```
 
 Output: 
 ```
 Hello World!
 HelloWorld!
 The value of i is: 2
 ```
 
**The Code**
```
 public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
``` 
 
**Compiling & Running**
```
javac HelloWorld1.java
java HelloWorld1
```
 
 ## Command Line Arguments (`HelloWorld2.java`)
 *  Taking in arguments from command line with `args[0]`
 
 **The Code**
 ```
 public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World " + args[0]);
	}
}
```
 
**Compiling & Running**
```
javac HelloWorld2.java
java HelloWorld2 Andrew 
```

If you didn't put the argument after `java HelloWorld2`, Java throws an exception 
`Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
	at HelloWorld2.main(HelloWorld2.java:8)`

## Other command-line commands 
* `cd` -- Change Directory
    * `cd ..` -- Go back up to previous directory
* `ls` -- List files in directory. For windows command prompt, use `dir`
* `javac <filename.java>` -- Compile java program
* `java <main class name>` -- Run java program