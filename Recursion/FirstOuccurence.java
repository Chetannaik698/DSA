public class FirstOuccurence {

    public static int fristOuccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
         if (arr[i] == key) {
            return i;
         }
         return fristOuccurence(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = {8, 4,-, 6, 7, 5, 7 ,9, 10};
        System.out.println(fristOuccurence(arr, 5, 0));
    }
}
