package Practise;

public class Test {
    public static int secondLargest(int arr[]) {
        int firstLrg = Integer.MIN_VALUE;
        int secLarg = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
           if (arr[i] > firstLrg) {
               firstLrg = arr[i];
           }
        }
        return firstLrg;
    }
     public static void main(String[] args) {
       int arr[] = {2, 4, 8, 9, 6, 10};
       System.out.println(secondLargest(arr));
     }
}
