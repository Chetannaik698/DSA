package Revision;

public class d2 {

    public static void prefixSum(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i + 1] = arr[i] + arr[i + 1];
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void subarraySumK(int arr[], int k) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    System.out.print("[");
                    for (int x = i; x <= j; x++) {
                        System.out.print(arr[x]);
                        if (x != j)
                            System.out.print(", ");
                    }
                    System.out.println("]");
                }
            }
        }
    }

    public static void MaxSubArraySum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                currSum = 0;
                for(int k=i; k<=j; k++) {
                    currSum += arr[k];
                }
            }
            if(currSum > maxSum) {
                maxSum = currSum;
            }
        }
        System.out.println("Max Sum = " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7};
        MaxSubArraySum(arr);
        // subarraySumK(arr, 5);
        // prefixSum(arr);
        // printArr(arr);
    }
}
