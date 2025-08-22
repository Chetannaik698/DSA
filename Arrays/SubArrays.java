package Arrays;

public class SubArrays {

    public static void prinSubarrays(int numbers[]){

        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;

        int currSum = 0;

        for(int i=0; i<numbers.length; i++) {
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++) {
                    System.out.print( + numbers[k] + " " );
                    currSum += numbers[k];

                    if (currSum < minSum) {
                        minSum = currSum;
                    }else if(currSum > maxSum){
                        maxSum = currSum;
                    }
                    
                }
                System.out.println(" Sum = " + currSum);
            }
            System.out.println();
        }

        System.out.println("Minimum Sum = " + minSum);
        System.out.println("Maximum Sum = " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        prinSubarrays(numbers);
    }
}
