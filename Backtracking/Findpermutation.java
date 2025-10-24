package Backtracking;

public class Findpermutation {

    public static void findPermutation(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String Newstr = str.substring(0, i) + str.substring(i + 1, str.length()); // here the i index element will
                                                                                      // be ignored not pushed in the
                                                                                      // string
            findPermutation(Newstr, ans + curr);
        }
    }
    
    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, "");
    }
}
