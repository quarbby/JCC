/********************************************************************************
 *	OOP -- Inheritance 
 *	The ColouredBox Class 
 *  Extends the Box Class
 ********************************************************************************/

public class ColouredBox extends Box {
	private String colour;
	public ColouredBox() {super();}

	public ColouredBox(int length, int breadth, int height, String colour) {
		super(length, breadth, height);
		this.colour = colour;
	}

	public ColouredBox(int length, String colour) {
		super(length);
		this.colour = colour;
	}

	// Create a coloured box from a given Box
    public ColouredBox(Box box, String colour) {
		super(box.getLength(), box.getBreadth(), box.getHeight());
		this.colour = colour;
	}

	public String toString() {
		return	super.toString() + 
				"\nColour: " + this.colour;
	}

    // Check if supplied coloured box has same properties
	public boolean equals(ColouredBox cBox) {
		return 	getLength() == cBox.getLength() &&
				getHeight() == cBox.getHeight() &&
				getBreadth() == cBox.getBreadth() &&
				cBox.colour.equals(this.colour);
	}
 
    public static void main(String[] args) {
        Box mysteryBox = new Box(1, 1, 1);
        Box aUnitCube = new Box(1);
        Box anotherCube = new Box(2);
        
        System.out.println("Is mysteryBox equal to anotherCube?");
        System.out.println(mysteryBox.equals(anotherCube) ? "Yes!" : "NO!");	
        
        ColouredBox rainbowBox = new ColouredBox(1, 1, 1, "rainbow");
        ColouredBox upgradedUnitCube = new ColouredBox(aUnitCube, "rainbow");

        System.out.println("Is Rainbox Box equal to Upgraded Unit Cube?");
        System.out.println(rainbowBox.equals(upgradedUnitCube) ? "Yes!" : "NO!");	
    }   
    
}