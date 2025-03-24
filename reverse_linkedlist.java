import java.util.Scanner;

public class ArrayToLinkedList {
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

        // Create a LinkedList object
        LinkedList linkedList = new LinkedList();

        // Convert the array to a linked list
        linkedList.arrayToLinkedList(arr);

        // Display the linked list
        System.out.println("Linked List:");
        linkedList.display();

        // Close the scanner
        scanner.close();
    }
}
