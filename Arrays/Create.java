package Arrays;

import java.util.Scanner;

public class Create {
    public static void main(String[] args) {
        int marks[] = new int[50];

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Phy = " + marks[0]);
        System.out.println("Math = " + marks[1]);
        System.out.println("Chem = " + marks[2]);
    }
}
