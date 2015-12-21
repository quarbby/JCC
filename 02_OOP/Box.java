/********************************************************************************
 *	OOP
 *	The Box Class 
 ********************************************************************************/

public class Box {
	private int length;
	private int breadth;
	private int height;

    // Default Constructor
	public Box() {}

	public Box(int length, int breadth, int height) {
		this.length 	= length;
		this.breadth 	= breadth;
		this.height 	= height;
	}

	public Box(int length) {
		this.length 	= length;
		this.breadth 	= length;
		this.height 	= length;
	}
	
	public int calculateVolume() {
		return this.length * this.breadth * this.height;
	}


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

	public boolean equals(Box box) {
		return	box.length == this.length &&
				box.breadth == this.breadth &&
				box.height == this.height;
	}

	public int getLength() 	{return this.length;}

	public int getBreadth() {return this.breadth;}

	public int getHeight() 	{return this.height;}
    
    public static void main (String[] args) {
        Box emptyBox = new Box();
        Box cubeBox = new Box(3,3,3);
        Box rectangleBox = new Box(3,2,4);
        
        int cubeBoxVolume = cubeBox.calculateVolume();
        System.out.println("Volume of Cube Box is: " + cubeBoxVolume);
    }
}