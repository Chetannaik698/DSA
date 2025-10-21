public class primtAlternate {

    public static void printAlternate(int arr[]) { 
        for(int i=0; i<arr.length; i = i+2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        printAlternate(arr);
    }
}
