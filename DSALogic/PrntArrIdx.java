public class PrntArrIdx {

    public static void printArrEleAndIdx(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.println("Index = " + i + "," + "Ele = " + arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 8, 10, 12, 14 };
        printArrEleAndIdx(arr);
    }
}