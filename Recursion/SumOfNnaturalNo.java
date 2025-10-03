package Recursion;

public class SumOfNnaturalNo {

    public static int Sum(int n) {
        if (n == 1) {
            return 1;
        }

        return n + Sum(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(Sum(n));
    }
}
