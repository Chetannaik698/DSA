package Arrays;

import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length -1;

        while (start <= end) {
            int mid  = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            }
            else if (numbers[mid] < key ) { //right
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the key to be searched: ");
        int key = sc.nextInt();

        System.out.println("The element is found at the index: " + binarySearch(numbers, key));
    }
}