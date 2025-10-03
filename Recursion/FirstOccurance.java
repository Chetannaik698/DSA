package Recursion;

public class FirstOccurance {

    public static int firstOccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }

        return firstOccurance(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        int idx = firstOccurance(arr, 5, 0);

        if (idx != -1) {
            System.out.println("Key Found at index: " + idx);
        } else {
            System.out.println("Key not found");

        }
    }
}
