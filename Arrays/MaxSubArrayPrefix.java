package Arrays;

public class MaxSubArrayPrefix {

    public static void MSAP(int numbers[]) {

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        int Prefix[] = new int[numbers.length];

        Prefix[0] = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            Prefix[i] = Prefix[i - 1] + numbers[i];
        }

        for(int i=0; i<Prefix.length; i++) {
            System.out.print(" | " + Prefix[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = start == 0 ? Prefix[end] : Prefix[end] - Prefix[start - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("\nThe max sum = " + maxSum);

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        MSAP(numbers);
    }
}
