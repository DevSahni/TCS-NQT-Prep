import java.util.Scanner;

public class BookExchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of books/students: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("There are no valid exchanges.");
            return;
        }

        // dp array to store derangement values
        long[] dp = new long[n + 1];

        // Base cases
        dp[0] = 1;  // By convention, !0 = 1 (empty set)
        dp[1] = 0;  // No way to derange 1 item

        // Fill dp array using the recursive formula
        for (int i = 2; i <= n; i++) {
            dp[i] = (i - 1) * (dp[i - 1] + dp[i - 2]);
        }

        System.out.println("The number of possible valid exchanges: " + dp[n]);
    }
}
