import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // number of elements in array
        int[] arr = new int[n]; // input array
        
        // Taking input of array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // HashMap to store element and its frequency
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        // Counting frequency of each element
        for (int i = 0; i < n; i++) {
            if (!mp.containsKey(arr[i])) { 
                // If the element is not already present in the map, add it with frequency 1
                mp.put(arr[i], 1);
            } else {
                // If the element is already present, increment its frequency
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
        }
        
        // Printing elements with even frequencies
        for (HashMap.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
