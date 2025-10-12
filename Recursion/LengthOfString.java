package Recursion;

public class LengthOfString {

    public static int strLen(String str, int idx) {

        if (idx == str.length()) {
            return 0;
        }

        int len = 1;
        return len += strLen(str, idx + 1);

    }

    public static void main(String[] args) {
        System.out.println(strLen("Chetan", 0));
    }
}
