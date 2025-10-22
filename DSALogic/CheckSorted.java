public class CheckSorted {

    public static void checkSortedWay(int arr[]) {
        boolean isAscending = true;
        boolean isDescending = true;

        for(int i=0; i<arr.length-1; i++){
            if (arr[i] < arr[i+1]){
                isDescending = false;
            }else if (!(arr[i] > arr[i+1] )) {
                isAscending = false;
            }
        }

        if (isAscending) {
            System.out.println("Forward");
        } else if (isDescending) {
            System.out.println("Backward");
        }else{
            System.out.println("Unsorted");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 6, 4, 8, 10, 12, 15 };
        checkSortedWay(arr);
    }
}
