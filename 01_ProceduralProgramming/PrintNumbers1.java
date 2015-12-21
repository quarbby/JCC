/********************************************************************************
 * Let's print numbers instead! 
 * Introducing the for-loop
 * Introducing short-hand if-else
 ********************************************************************************/

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