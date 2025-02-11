import java.util.Scanner;

public class Largest {

    public static void getLargest(int matrix[][]) {
        int maxValue = Integer.MIN_VALUE;

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
               if (matrix[i][j] > maxValue) {
                  maxValue = matrix[i][j];
               }
            }
        }
        System.out.println("The largest value is: " + maxValue);

    }

    public static void getSmallest(int matrix[][]) {
        int minValue = Integer.MAX_VALUE;

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
               if (matrix[i][j] < minValue) {
                  minValue = matrix[i][j];
               }
            }
        }
        System.out.println("The Smallest value is: " + minValue);

    }

    public static void main(String[] args) {
        int matrix[][] = new int[4][4];
        int n = matrix.length;
        int m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        //print matrix
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                 System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        getSmallest(matrix);
        getLargest(matrix);
    }
}
