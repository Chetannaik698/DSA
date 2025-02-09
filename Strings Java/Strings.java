import java.util.Scanner;

public static void printLetters(String str){
    for(int i=0; i<str.length(); i++){
        System.out.print(str.charAt(i));
    }
    System.out.println();
}

public class Strings {
    public static void main(String[] args) {
        char arr[] = {'a', 'b' , 'c', 'd'};
        String str = "abcd";
        String str2 = new String("abcd");

        Scanner sc = new Scanner(System.in);
        String Firstname = "Chetan";
        String Lastname = "Naik";
        System.out.println(Firstname + " " +  Lastname);
        System.out.println(Firstname.charAt(0));
        printLetters(Firstname);
    }
}
