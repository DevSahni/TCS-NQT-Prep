import java.util.Scanner;

public class GoodStringDistance {

    // Function to calculate the minimum distance for a character from good string
    public static int findMinDistance(char nameChar, char[] goodString) {
        int minDistance = Integer.MAX_VALUE;
        for (char goodChar : goodString) {
            int distance = Math.abs(nameChar - goodChar);
            minDistance = Math.min(minDistance, distance);
        }
        return minDistance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the good string
        String goodStringInput = scanner.nextLine();
        char[] goodString = goodStringInput.toCharArray();

        // Input the student's name
        String name = scanner.nextLine();
        char[] nameChars = name.toCharArray();

        // Variable to store the total distance
        int totalDistance = 0;

        // For each character in the name, find the minimum distance to a character in the good string
        for (char nameChar : nameChars) {
            totalDistance += findMinDistance(nameChar, goodString);
        }

        // Output the total distance
        System.out.println(totalDistance);

        scanner.close();
    }
}
