public class Inversion {

    public static int countInversion(int arr[]) {
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<i; j++) {
                if (arr[j] > arr[i]) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
    }
}
