public class CalSumAndProduct {

    public static void SumAndProduct(int arr[]) {

        int sum = 0;
        int product = 1;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            product *= arr[i];
        }

        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        SumAndProduct(arr);
    }
}
