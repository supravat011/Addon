package day1;
import java.util.Arrays;

public class Deletion {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5, 6};
        
        System.out.println("Original array: " + Arrays.toString(arr));

        int indexToDelete = 2;

        arr = deleteElement(arr, indexToDelete);

        System.out.println("Array after deletion: " + Arrays.toString(arr));
    }

    public static int[] deleteElement(int[] arr, int indexToDelete) {

        if (indexToDelete < 0 || indexToDelete >= arr.length) {
            System.out.println("Invalid index.");
            return arr;
        }

        int[] newArr = new int[arr.length - 1];

        for (int i = 0; i < indexToDelete; i++) {
            newArr[i] = arr[i];
        }

        for (int i = indexToDelete + 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }

        return newArr;
    }
}
