package PractiseQuestions;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Side: ");
        int side = sc.nextInt();

        int area = side * side;
        System.out.println("Area = " + area);
    }
}
