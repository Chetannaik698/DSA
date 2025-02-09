public class LastOccurence {
    public static int firstOuccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
         if (arr[i] == key) {
            return i;
         }
         return firstOuccurence(arr, key, i + 1);
    }

    public static int lastOuccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
          int isFound = lastOuccurence(arr, key, i + 1);
          if (isFound == -1 && arr[i] == key) {
            return i;
          }
          return isFound;
    }

    public static void main(String[] args) {
        int arr[] = {8, 4, 5, 6, 7, 5,  7 ,9, 10};
        System.out.println(lastOuccurence(arr, 5, 0));
    }
}
