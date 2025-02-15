package BackTracking;

public class Test {

    public static void backTracking(int arr[], int i, int val) {
        //base case
        if (i == arr.length) {
            printArray(arr);
            return;
        }

        //recursion
        arr[i] = val;
        backTracking(arr, i+1, val+1);
        arr[i] = arr[i] - 2; //in this step we are bac tracting the array values
    }

    // print array
    public static void printArray(int arr[]) {
       for(int i=0; i<arr.length; i++) {
         System.out.print(arr[i] + " ");
       }
       System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        backTracking(arr, 0, 1);
        printArray(arr);
    }
}
