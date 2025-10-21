public class printDublicate {

    public static void printDublicate(int arr[]) {
        int dubArr[] = new int[arr.length];
        int i, j;

        for (i = 0, j = 0; i < arr.length; i++, j++) {
            dubArr[j] = arr[i];
        }

        System.out.print("Original: " + " ");
        printArr(arr);

        System.out.print("Dublicate: " + " ");
        printArr(dubArr);
    }

    public static void printArr(int arr[]) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 20, 30, 40, 50 };
        printDublicate(arr);
    }
}
