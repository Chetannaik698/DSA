package BackTracking;

public class SubString {

    public static void printSubString(String str, String ans, int i ) {
        //base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            }
            else {
                System.out.println(ans);
            }
            return;
        }

        //recursion
        printSubString(str, ans+str.charAt(i), i+1);
        printSubString(str, ans, i+1);
    }

    public static void main(String[] args) {
        String str = "abc";
        printSubString(str, "", 0);
    }
}
