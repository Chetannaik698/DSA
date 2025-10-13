package Revision;

public class d1 {

    public static void MinMax(int arr[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int secLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secLargest = max;
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > secLargest && arr[i] < max) {
                secLargest = arr[i];
            }
        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("Second Largest = " + secLargest);
    }

    public static void reverse(int arr[]) {

        int si = 0;
        int ei = arr.length - 1;

        while (si < ei) {
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;

            si++;
            ei--;
        }
    }

    public static boolean isSorted(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void moveZeros(int arr[]) {
        int nonZeroIndex = 0;

        for(int i=0; i<arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }

        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 8, 2};
        MinMax(arr);

        // reverse(arr);
        // printArr(arr);

        // int arr[] = { 0, 1, 0, 3, 12};
        // moveZeros(arr);
        // printArr(arr);
    }
}
