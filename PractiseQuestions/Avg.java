package PractiseQuestions;

import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        System.out.println("___Program to find average of 3 numbers ___");
        int n = 3;

        Scanner sc = new Scanner(System.in);

        System.out.print("A = ");
        int a = sc.nextInt();

        System.out.print("B = ");
        int b = sc.nextInt();

        System.out.print("C = ");
        int c = sc.nextInt();

        float avg = (a+b+c) / n;
        System.out.println("Average = " + avg);
    }
}
