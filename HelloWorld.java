/********************************************************************************
 *	Structure of a Hello World program
 *	main as a static method of a public class 
 * 	(static, class and public to be explained later)
 *	naming of source files
 *	System.out.println to be used to introduce packages and libraries briefly
 ********************************************************************************/
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}

// To be changed to:
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello " + args[0]);
	}
}

/********************************************************************************
 *	Basic command-line usage, compilation and execution of a Java program
 *	cd, ls/dir, java, javac
 ********************************************************************************/
// javac HelloWorld.java
// java HelloWorld

// To be updated to:
// javac HelloWorld.java
// java HelloWorld Andrew 

/********************************************************************************
 *	Recap of procedural programming 
 *	(more time will be devoted to this for CS1101S/CS1010S students; relevant subtopics marked with *)
 *	data types*
 *	abstraction using functions
 *	conditionals
 *	loops*
 *	arrays*
 ********************************************************************************/

// First interesting problem - what if the user don't know that you are required to put his/her name there?
// *To urge them to attempt it on their own.

public class HelloWorld {
	public static void main(String[] args) {
		if(args.length == 0) {
			// There is no arguements provided
			System.out.println("Please include your name behind");
			System.out.println("(i.e. java HelloWorld Name)");
		}
		else {
			System.out.println("Hello " + args[0]);
		}
	}
}

// Extending functionality to multiple names
public class HelloWorld {
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

public class HelloWorld {
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

public class HelloWorld {
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

// Abstraction using methods - separating out the printing of names.

public class HelloWorld {
	public static void main(String[] args) {
		if(args.length == 0) {
			// There is no arguements provided
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

	// If time permits - tenary operator (for fun)
	public static void printOneToTen() {
		for(int idx = 1; idx <= 10; idx++) {
			System.out.println(idx + ((idx % 2) == 0 ? "is an even number" : "is an odd number"));
		}
	}
}

// Something extra
public static void printNumbers(int... integers) { 
	for(int i : integers) {
		System.out.println(i + " was entered");
	}
}
/********************************************************************************
 *	OOP
 *	illustration with a simple Box class containing length, breadth and height attributes
 *	illustration of constructor
 *	brief mention of object references
 *	introduction to methods using a getVolume() method for the Box class
 *	access modifiers, with the attributes being made private and a setLBH() method being implemented with sanity checks
 *	introduction to inheritance with a ColouredBox class
 ********************************************************************************/
public class Box {
	private int length;
	private int breadth;
	private int height;

	/********************************************************************************
	 *	Default Constructor - creates a 0 length 0 breadth 0 height box.
	 ********************************************************************************/
	public Box() {}

	/********************************************************************************
	 *	Create a box
	 ********************************************************************************/
	public Box(int length, int breadth, int height) {
		this.length 	= length;
		this.breadth 	= breath;
		this.height 	= height;
	}

	/********************************************************************************
	 *	This is creating a box with equal length, breadth, height.
	 ********************************************************************************/
	public Box(int length) {
		this.length 	= length;
		this.breadth 	= length;
		this.height 	= length;
	}
	
	/********************************************************************************
	 *	Calculate the volume of this box.
	 ********************************************************************************/
	public int calculateVolume() {
		return this.length * this.breadth * this.height;
	}

	/********************************************************************************
	 *	Calculate the external surface area of the box, inclusive of the top.
	 ********************************************************************************/
	public int calculateSurfaceArea() {
		return 	2 * this.length * this.breadth 	+		// This is the top and bottom
				2 * this.length * this.height 	+ 		// This is the front and back
				2 * this.breadth * this.height;			// This is the two sides of the box
	}

	public String toString() {
		return 	"Length: " + this.length 		+ 
				"\nBreadth: " + this.breadth 	+
				"\nHeight: " + this.height;
	}

	/********************************************************************************
	 *	Check if the supplied box is has the same measurements as this box.
	 ********************************************************************************/
	public boolean equals(Box box) {
		return	box.length == this.length &&
				box.breadth == this.breadth &&
				box.height == this.height;
	}
	/********************************************************************************
	 *	Accessors to the attributes of this box.
	 ********************************************************************************/

	/********************************************************************************
	 *	Retrieves the value stored for the length of this box
	 ********************************************************************************/
	public int getLength() 	{return this.length;}

	/********************************************************************************
	 *	Retrieves the value stored for the breadth of this box
	 ********************************************************************************/
	public int getBreadth() {return this.breadth;}

	/********************************************************************************
	 *	Retrieves the value stored for the height of this box
	 ********************************************************************************/
	public int getHeight() 	{return this.height;}
}

// So, what do you need to do to extend this box class to be able to accept units? (cm, m, etc)
// Is there a way to make sure there are no "0" or negative values of the 3 measurements? (length != 0) vs (length <= 0)

public class ColouredBox extends Box {
	private String colour;
	public ColouredBox() {super();}

	/********************************************************************************
	 *	Create a coloured box.
	 ********************************************************************************/
	public ColouredBox(int length, int breadth, int height, String colour) {
		super(length, breadth, height);
		this.colour = colour;
	}

	/********************************************************************************
	 *	Create a coloured unit box. (length, breadth and height are the same)
	 ********************************************************************************/
	public ColouredBox(int length, String colour) {
		super(length);
		this.colour = colour;
	}

	/********************************************************************************
	 *	Create a coloured unit box from a given normal Box.
	 ********************************************************************************/
	public ColouredBox(Box box, String colour) {
		super(box.getLength(), box.getBreadth(), box.getHeight());
		this.colour = colour;
	}

	public String toString() {
		return	super.toString() + 
				"\nColour: " + this.colour;
	}

	/********************************************************************************
	 *	Checks if the supplied ColouredBox has the same properties this.
	 ********************************************************************************/
	public boolean equals(ColouredBox cBox) {
		return 	getLength() == cBox.getLength() &&
				getHeight() == cBox.getHeight() &&
				getBreadth() == cBox.getBreadth() &&
				cBox.colour.equals(this.colour);
	}
}

public static void messWithBoxes() {
	Box mysteryBox = new Box(1, 1, 1);
	Box aUnitCube = new Box(1);
	
	System.out.println("Is the two Boxes '=='? " + mysteryBox == aUnitCube ? "Yes!" : "NO!");
	System.out.println("Is the two Boxes '.equals()'? " + mysteryBox.equals(aUnitCube) ? "Yes!" : "NO!");

	ColouredBox rainbowBox = new ColouredBox(1, 1, 1, "rainbow");
	ColouredBox upgradedUnitCube = new ColouredBox(aUnitBox, "rainbow");

	System.out.println("Is the two Boxes '=='? " + rainbowBox == upgradedUnitCube ? "Yes!" : "NO!");
	System.out.println("Is the two Boxes '.equals()'? " + rainbowBox.equals(upgradedUnitCube) ? "Yes!" : "NO!");	

}

// Additional questions to inspire:
// Can you do "rainbowBox.equals(aUnitCube)"?
// What can you do to make it work? (assuming colour is not significant)

public boolean equals(Box box) {
	return super.equals(box);
}
/********************************************************************************
 *	Java class library
 *	Scanner
 *	Math
 *	String (if time permits)
 ********************************************************************************/

public static doSomethingRandom() {

	Scanner scanner = new Scanner(System.in);
	// <Abstract Datatype> <Your Variable Name> = "new" <Constructor>(<Parameters>);

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

	// What about "pow"

	String myString = new String("This is just a random string");
	System.out.println("First letter of this string is: " + myString.charAt(0));
	System.out.println("The last letter of this string is " + myString.charAt(myString.size()-1))
	System.out.println("The middle letter of this string is: " + (myString.charAt(myString.size()/2);
}
