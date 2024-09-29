import java.util.HashMap;
import java.util.Scanner;

public class ShoePairing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of shoes
        System.out.println("Enter the number of shoes:");
        int n = sc.nextInt();

        // Input shoe descriptions
        String[] shoes = new String[n];
        for (int i = 0; i < n; i++) {
            shoes[i] = sc.next();
        }

        // HashMaps to store counts of left and right shoes for each size
        HashMap<Integer, Integer> leftShoes = new HashMap<>();
        HashMap<Integer, Integer> rightShoes = new HashMap<>();

        // Parse the input shoes and store counts in respective HashMaps
        for (String shoe : shoes) {
            int size = Integer.parseInt(shoe.substring(0, shoe.length() - 1));
            char type = shoe.charAt(shoe.length() - 1);

            if (type == 'L') {
                leftShoes.put(size, leftShoes.getOrDefault(size, 0) + 1);
            } else if (type == 'R') {
                rightShoes.put(size, rightShoes.getOrDefault(size, 0) + 1);
            }
        }

        // Calculate the number of valid pairs
        int pairs = 0;
        for (int size : leftShoes.keySet()) {
            if (rightShoes.containsKey(size)) {
                // Minimum of left and right shoes gives the number of pairs for this size
                pairs += Math.min(leftShoes.get(size), rightShoes.get(size));
            }
        }

        // Output the result
        System.out.println("Number of pairs: " + pairs);
    }
}
