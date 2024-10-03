/*Problem:
Given a sorted array of integers, find if there exists a pair whose sum is equal to a given target.

Example:
Input: arr = [1, 2, 4, 6, 8, 9], target = 10
Output: True (because 1 + 9 = 10)

Optimal Solution:
A two-pointer approach can solve this in O(n) time by maintaining two pointers, one at the start and one at the end of the array, and adjusting them based on the sum comparison.
*/
public class TwoPointerSolution {
    public static boolean findPair(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        
        while (left < right) {
            int sum = arr[left] + arr[right];
            
            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;  // Move left pointer to right
            } else {
                right--;  // Move right pointer to left
            }
        }
        
        return false;  // No pair found
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 6, 8, 9};
        int target = 10;
        
        if (findPair(arr, target)) {
            System.out.println("Pair found");
        } else {
            System.out.println("Pair not found");
        }
    }
}
