package Arrays;

public class Kadanes {

    public static void kadanes(int numbers[]) {
        // case 1
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];

            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max Sum is = " + ms);
    }

    public static void kadanes2(int numbers[]) {
        // case 2
        int ms = numbers[0];
        int cs = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            cs = Math.max(numbers[i], cs + numbers[i]);
            ms = Math.max(ms, cs);
        }
        System.out.println("Max Sum is = " + ms);
    }

    public static void main(String[] args) {
        int numbers[] = { -1, -2, -3, -4 };
        kadanes2(numbers);
    }
}
