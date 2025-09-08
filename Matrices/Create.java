package Matrices;

import java.util.Scanner;

public class Create {

    public static boolean Search(int matrix[][], int key) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("The element is found at: " + "(" + i + ","+ j + ")");
                    return true;
                }
            }
        }
        return false;
    } 

     public static int MaxEle(int matrix[][]) {

        int maxEle = Integer.MIN_VALUE;

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if (matrix[i][j] > maxEle) {
                    maxEle = matrix[i][j];
                }
            }
        }
        return maxEle;
    } 

    
     public static int MinEle(int matrix[][]) {

        int minEle = Integer.MAX_VALUE;

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if (matrix[i][j] < minEle) {
                    minEle = matrix[i][j];
                }
            }
        }
        return minEle;
    } 

     public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        Scanner sc = new Scanner(System.in);

        //inputting the value in to matrix
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //printing elements in the matrix
        
        //inputting the value in to matrix
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //Searching elemnts in the matrix
        System.out.print("Enter the key you want to search: ");
        int key = sc.nextInt();
        Search(matrix, key);

        //MaxEle
        System.out.println("Max Element: " + MaxEle(matrix));

        //MaxEle
        System.out.println("Min Element: " + MinEle(matrix));
    }
}