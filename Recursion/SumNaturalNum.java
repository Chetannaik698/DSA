public class SumNaturalNum {

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int snm1 = sum(n-1);
        int smn = n + snm1;
        return smn;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sum(n));
    }
}
