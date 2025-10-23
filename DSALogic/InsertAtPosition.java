public class InsertAtPosition {

    public static void insertElement(int arr[], int pos, int ele) {
        int newArr[] = new int[arr.length + 1];

        for(int i = 0; i<pos; i++) {
            newArr[i] = arr[i];
        }

        newArr[pos] = ele;

        for(int i = pos; i<arr.length; i++) {
            newArr[i+1] = arr[i];
        }

        printArr(newArr);
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 10, 15, 20, 30, 35, 50 };
        insertElement(arr, 2, 25);
    }
}
