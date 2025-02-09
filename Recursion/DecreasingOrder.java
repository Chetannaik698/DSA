public class DecreasingOrder {
    
    public static void decreasing(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " "); //print n value that means 10
        decreasing(n-1);
    }

    public static void main(String[] args) {
        int n = 10;
        decreasing(n);
    }
}
