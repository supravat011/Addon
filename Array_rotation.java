import java.util.Scanner;

public class ArrayLeftRotation {
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
        
        // Ask the user for the number of rotations
        System.out.print("Enter the number of rotations: ");
        int rotations = scanner.nextInt();
        
        // Perform the left rotation
        leftRotate(arr, rotations);
        
        // Print the rotated array
        System.out.println("Array after left rotation:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        
        // Close the scanner
        scanner.close();
    }
    
    public static void leftRotate(int[] arr, int d) {
        int size = arr.length;
        // To handle the case where d > size
        d = d % size;
        
        // Rotate the array by d positions
        reverse(arr, 0, d - 1);
        reverse(arr, d, size - 1);
        reverse(arr, 0, size - 1);
    }
    
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            // Swap the elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // Move the pointers towards the center
            start++;
            end--;
        }
    }
}
