
import java.util.Scanner;

public class SwapBubbelSort {

    // Function to count the number of swaps required to sort the array in ascending order
    public static int countSwapsAscending(int[] arr) {
        int swaps = 0;
        int n = arr.length;
        int[] tempArr = arr.clone(); // Clone the array to preserve the original array

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (tempArr[j] > tempArr[j + 1]) {
                    // Swap the elements
                    int temp = tempArr[j];
                    tempArr[j] = tempArr[j + 1];
                    tempArr[j + 1] = temp;
                    swaps++; // Increment the swap counter
                }
            }
        }
        return swaps;
    }

    // Function to count the number of swaps required to sort the array in descending order
    public static int countSwapsDescending(int[] arr) {
        int swaps = 0;
        int n = arr.length;
        int[] tempArr = arr.clone(); // Clone the array to preserve the original array

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (tempArr[j] < tempArr[j + 1]) {
                    // Swap the elements
                    int temp = tempArr[j];
                    tempArr[j] = tempArr[j + 1];
                    tempArr[j + 1] = temp;
                    swaps++; // Increment the swap counter
                }
            }
        }
        return swaps;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of elements in the array
        int N = scanner.nextInt();
        int[] arr = new int[N];

        // Input the elements of the array
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Count the swaps for ascending and descending orders
        int ascendingSwaps = countSwapsAscending(arr);
        int descendingSwaps = countSwapsDescending(arr);

        // Output the minimum number of swaps
        System.out.println(Math.min(ascendingSwaps, descendingSwaps));

        scanner.close();
    }
}
