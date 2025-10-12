package Recursion;

public class NumToString {

    public static void printEnglish(int n) {

        String words[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" };

        // base case
        if (n == 0) {
            return;
        }

        int lastDigit = n % 10;

        printEnglish(n / 10);

        System.out.print(words[lastDigit] + " ");

    }

    public static void main(String[] args) {
        printEnglish(2019);
    }
}