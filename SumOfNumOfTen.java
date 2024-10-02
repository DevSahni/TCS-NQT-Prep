import java.util.Scanner;

public class SumOfNumOfTen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :");
        int n=sc.nextInt();
        int sum=55*n;
        System.out.println("Sum of first 10 multiple number of "+n+"is :"+sum);
        sc.close();
    }
}
