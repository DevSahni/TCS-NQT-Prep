
import java.util.Scanner;

public class BinaryToDecimalAfterToggel {
    public static void main(String[] args) {
        // Take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        // Find the number of bits in the number (position of the MSB)
        int msbPosition = (int) (Math.floor(Math.log(num) / Math.log(2))) + 1;

        // Create a mask with all bits from MSB set to 1
        int mask = (1 << msbPosition) - 1;

        // Toggle all bits using XOR with the mask
        int toggledNum = num ^ mask;

        // Print the result
        System.out.println("The number after toggling all bits: " + toggledNum);
    }
}
