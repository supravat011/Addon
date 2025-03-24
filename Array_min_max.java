import java.util.Scanner;

public class ArrayMinMax {
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
        
        // Initialize the min and max variables
        int min = arr[0];
        int max = arr[0];
        
        // Loop through the array to find the min and max values
        for (int i = 1; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        // Print the minimum and maximum values
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        
        // Close the scanner
        scanner.close();
    }
}
