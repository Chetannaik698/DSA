public class ArrForEvenOdd {

    public static void EvenOdd(int arr[]) {
        int EvenArr[] = new int[arr.length];
        int OddArr[] = new int[arr.length];

        int j = 0, k = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                EvenArr[j] = arr[i];
                j++;
            } else {
                OddArr[k] = arr[i];
                k++;
            }
        }

        System.out.println("Even Array: ");
        printArr(EvenArr, j);

        System.out.println("Odd Array: ");
        printArr(OddArr, k);
    }

    public static void printArr(int arr[], int size) {
        for (int k = 0; k < size; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        EvenOdd(arr);
    }
}
