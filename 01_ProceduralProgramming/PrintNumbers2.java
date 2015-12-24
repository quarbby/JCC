/********************************************************************************
 * Let's print numbers instead! 
 * Introducing the for-loop
 ********************************************************************************/

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