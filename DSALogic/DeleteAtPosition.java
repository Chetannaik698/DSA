public class DeleteAtPosition {

    public static void deleteAtPosition(int arr[], int pos) {
        int newArr[] = new int[arr.length];

        for(int i=0; i<pos; i++) {
            newArr[i] = arr[i];
        }

        for(int i=pos+1; i<arr.length; i++) {
            newArr[i-1] = arr[i]; //here it will shift left by one
        }

        PrintArr(newArr);
    }

    public static void PrintArr(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
         int arr[] = { 10, 15, 20, 30, 35, 50 };
         deleteAtPosition(arr, 2);
    }
}