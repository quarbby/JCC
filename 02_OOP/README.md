# Object Oriented Programming 
 *	Illustration with a simple Box class containing length, breadth and height attributes
 *	Illustration of constructor
 *	Brief mention of object references
 *	Introduction to methods using a getVolume() method for the Box class
 *	Access modifiers, with the attributes being made private and a setLBH() method being implemented with sanity checks
 *	Introduction to inheritance with a ColouredBox class
 
 ## Box class 
    * General outline 
    ```
    public class Box {
        // Private variables 
        
        // Constructors and Methods
        
        public static void main(String[] args) {
        }
    }
    ```
    * Private variables 
        - Private so other people cannot acces them
        `private int length;`
    * Constructors (usually public) 
        - *Default* constructor: initialise a box with no length, breadth, height
        `public Box() {}`
        - *Overloaded* constructor to initialise a box with given parameters
        ```
        public Box(int length, int breadth, int height) {
            this.length 	= length;
            this.breadth 	= breadth;
            this.height 	= height;
        }
        ```
        Overloading matches the parameters passed into the constructor to determine which constructor to call
    * `this` keyword 
        > The most common reason for using the this keyword is because a field is shadowed by a method or constructor parameter. *From the Java Docs*
        - The this keyword is used when you need to use class global variable in the constructors. this is a reference to the current object — the object whose method or constructor is being called. You can refer to any member of the current object from within an instance method or a constructor by using this.
    * Methods 
        - May be public/ private 
        ```
        public int calculateVolume() {
            return this.length * this.breadth * this.height;
        }
        ```
    * Accessors methods: To access private values in the class 
        - Extension *getters and setters* & Eclipse has functionality to write the methods
        ```
        	public int getLength() 	{ return this.length; }
        ```
    * Initialising a Box in `main` class
    ```
    Box emptyBox = new Box();
    Box cubeBox = new Box(3,3,3);
    ```
    * Call methods associated with a box
    `int cubeBoxVolume = cubeBox.calculateVolume();`
 
 **The Code**
 Found in `Box.java`. Modify the `main` class to call more methods 
 
 **Compiling and Running**
 ```
 javac Box.java
 java Box
 ```
 
 ## Inheritance (`ColouredBox.java`)
    * `Extends` for inheritance 
        `public class ColouredBox extends Box`
    * `super()` constructor
        `public ColouredBox() { super(); }`
        > If your method overrides one of its superclass's methods, you can invoke the overridden method through the use of the keyword super. *From [Java Docs](https://docs.oracle.com/javase/tutorial/java/IandI/super.html)*
 
 **The Code**
 Found in `ColouredBox.java`. Modify the `main` class to call more methods 
 
**Compiling and Running**
```
javac ColouredBox.java
java ColouredBox
```

Output:
```
Is mysteryBox equal to anotherCube?
NO!
Is Rainbox Box equal to Upgraded Unit Cube?
Yes!
```