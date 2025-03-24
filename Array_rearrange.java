import java.util.Arrays;
import java.util.Scanner;

public class ArrayRearrangeAscending {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        // Create an array with the given size
        int[] arr = new int[size];
        
        // Get the array elements from the user
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Sort the array in ascending order
        Arrays.sort(arr);
        
        // Print the sorted (rearranged) array
        System.out.println("Array rearranged in ascending order:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        
        // Close the scanner
        scanner.close();
    }
}
