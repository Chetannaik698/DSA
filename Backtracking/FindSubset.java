package Backtracking;

public class FindSubset {

    public static void findSubsets(String str, String ans, int i) {
        // base case
        if (i == str.length()) {

            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // recursion
        // yes choice
        findSubsets(str, ans + str.charAt(i), i + 1);

        // No choice
        findSubsets(str, ans, i + 1); // here we will not store any value in the answer string
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
    }
}
