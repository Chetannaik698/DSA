package Sorting;

public class Bubble {

    public static void bubbleSort(int nums[]) {
        for (int turn = 0; turn < nums.length - 1; turn++) {

            int swap = 0;

            for (int j = 0; j < nums.length - 1 - turn; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swap++;
                }
            }

            if (swap == 0) {
                System.out.println("Array is already Sorted");
                break;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 5, 4 };
        bubbleSort(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
