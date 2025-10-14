package Arrays;

public class MaxSubarraySum {

    public static void maxSubArraySum(int numbers[]) {

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                currSum = 0;
                for(int k=i; k<=j; k++){
                   currSum += numbers[k];
                }
                System.out.println(currSum);
            }
            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }
        System.out.println("The max sum = " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {4, 5, 6, 7};
        maxSubArraySum(numbers);
    }
}
