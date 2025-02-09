public class IncreasingOrder {

    public static void increasing(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        increasing(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        int n = 10;
       increasing(n);
    }
}
