public class Fibonacci {

    public static int fibonacci(int n) { 
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fibonacci(n-1);
        int fnm2 = fibonacci(n-2);
        int fibN = fnm1 + fnm2;
        return fibN;
    }
    public static void main(String[] args) {
        int n = 50;
        System.out.println(fibonacci(n));
    }
}
