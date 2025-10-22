public class CountOccurance {

    public static int countOccurance(int arr[], int target) {
        int count = 0;
        int i  = 0;

        while (i <= arr.length-1) {
            if (arr[i] == target) {
                count++;
            }
            i++;
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 4, 8, 10, 4, 8, 9, 4, 23, 4, 5, 4, 17, 4 };
        int occurance = countOccurance(arr, 4);

        System.out.println("The element is occured " + occurance + " times in the array");
    }
}
