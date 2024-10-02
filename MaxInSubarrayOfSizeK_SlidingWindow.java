import java.util.Scanner;

public class MaxInSubarrayOfSizeK_SlidingWindow {
    // Function to find the maximum for each subarray of size k
    public static void printMaxInSubarrays(int[] arr, int n, int k) {
        // Traverse the array
        for (int i = 0; i <= n - k; i++) {
            // Initialize the maximum for the current window
            int max = arr[i];
            
            // Traverse the current window and find the maximum
            for (int j = 1; j < k; j++) {
                if (arr[i + j] > max) {
                    max = arr[i + j];
                }
            }
            
            // Print the maximum for the current window
            System.out.print(max + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the size of the subarray (K): ");
        int k = sc.nextInt();
        
        System.out.println("Maximums of each subarray of size " + k + ":");
        printMaxInSubarrays(arr, n, k);
        
        sc.close();
    }
}
