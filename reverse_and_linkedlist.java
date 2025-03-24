class Node {
    int data;
    Node next;

    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Method to add a node at the end of the list
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to convert an array to a linked list
    public void arrayToLinkedList(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            append(arr[i]);
        }
    }
}

public class ReverseArrayAndLinkedList {
    public static void main(String[] args) {
        // Create a scanner object for user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
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

        // Reverse the array
        reverseArray(arr);

        // Create a LinkedList object
        LinkedList linkedList = new LinkedList();

        // Convert the reversed array to a linked list
        linkedList.arrayToLinkedList(arr);

        // Display the linked list
        System.out.println("Linked List after reversing the array:");
        linkedList.display();

        // Close the scanner
        scanner.close();
    }

    // Method to reverse the array
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

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
