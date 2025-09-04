package Sorting;

import java.util.Arrays;

public class Insertion {

    public static void InsertionSort(int arr[]) {
        for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;

            while (prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }

            arr[prev+1] = curr;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        InsertionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int arr2[] = {5, 4, 2, 3, 1};

        Arrays.sort(arr2);

        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
