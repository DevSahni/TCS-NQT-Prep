import java.util.*;
public class TcsNqt19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number in string:");
    int num = sc.nextInt();
    while(num!=0){
        if (num/4) {
            return 1;
        }
        else{
            return 0;
        }
    }

    }
}
