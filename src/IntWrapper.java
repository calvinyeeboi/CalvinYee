/**
 * 
 */
import java.util.Scanner;
/**
 * @author Yee
 *
 */
public class IntWrapper {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        // 1) prompt and read an int, then print binary, octal and hex
        // of the int
        int input;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        input = scan.nextInt();
        
        String intObjBinary = Integer.toBinaryString(input);
        String intObjOctal = Integer.toOctalString(input);
        String intObjHex = Integer.toHexString(input);
        
        System.out.println("Binary: " + intObjBinary);
        System.out.println("Octal: " + intObjOctal);
        System.out.println("Hexadecimal: " + intObjHex);
        
        // 2) print max and min possible Java int values
        // use constants in Integer class that hold these values
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        
        System.out.println("Max value of an Integer: " + maxInt);
        System.out.println("Min value of an Integer: " + minInt);
        
        // 3) prompt user to enter 2 decimal integers, one per line
        // read them in with scanner using next method
        // convert strings to ints using Integer, add together,
        // then print out the sum
        System.out.print("Enter an integer: ");
        String firstInt = scan.next();
        System.out.print("Enter another integer: ");
        String secondInt = scan.next();
        
        Integer firstIntObj = Integer.parseInt(firstInt);
        Integer secondIntObj = Integer.parseInt(secondInt);
        
        int sum = firstIntObj.intValue() + secondIntObj.intValue();
        
        System.out.println("The sum of " + firstInt + " and " + secondInt
                            + " is: " + sum);
        
        }

}
