public class FindOddOccurrence {
    public static int findOdd(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num; // XOR operation
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,3,2,5,4,4,5,3};
        System.out.println("The odd occurring element is: " + findOdd(arr));
    }
}
