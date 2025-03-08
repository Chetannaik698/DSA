package Stack;

import java.util.Stack;

public class DuplicateParentheses {

    public static boolean isDublicate(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            //closing
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }g`
                if (count < 1) {
                    return true; //dublicate
                }
                else{
                    s.pop(); //opening pair
                }
            }else {
                //opening
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
       String  str = "((a+b) + (a-b))";
       String str2 = "(((a+b) + (a-b)))";

       System.out.println(isDublicate(str));
       System.out.println(isDublicate(str2));
    }
}
