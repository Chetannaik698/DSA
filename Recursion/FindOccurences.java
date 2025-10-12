package Recursion;

public class FindOccurences {

    public static void printOccurence(int arr[], int key, int idx) {
        if (idx  == arr.length ) {
            return;
        }
        //kamm
        if (arr[idx] == key) {
            System.out.print(idx + " ");
        }

        printOccurence(arr, key, idx+1);
    }

    public static void main(String[] args) {
   
        int arr[] = {4, 5, 6, 8, 4, 2, 4, 6, 9, 4};
        
        printOccurence(arr, 4, 0);
    }
}
