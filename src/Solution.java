import java.util.Scanner;

public class Solution {
    
    // TODO: Write the generic method findMax(T[] array) here
    // Hint: The type parameter T must extend Comparable<T>
    public static <T extends Comparable<T>> T findMax(T[] array) {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        // Call findMax on intArray and print the result
        // Format: "Max Integer: [val]"
        int N = scanner.nextInt();
        Integer[] intArray = new Integer[N];
        for(int i=0;i<N;i++) intArray[i] = scanner.nextInt();
        // Call findMax on strArray and print the result
        // Format: "Max String: [val]"
        N = scanner.nextInt();
       String[] strArray = new String[N];
        for(int i = 0; i < N; i++) {
            strArray[i] = scanner.next();
        }        
        System.out.println("Max Integer: "+findMax(intArray));
        System.out.print("Max String: "+findMax(strArray));
        scanner.close();
    }
}
