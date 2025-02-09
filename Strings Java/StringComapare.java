public class StringComapare {
    public static void main(String[] args) {
        String s1 = "Chetan";
        String s3 = new String("Chetan");

        // if (s1 == s3) {
        //     System.out.println("Strings are equal");
        // }else {
        //     System.out.println("Strings are not equal");
        // }

        if (s1.equals(s3)) {
            System.out.println("Strings are equal");
        }else {
            System.out.println("Strings are not equal");
        }
    }
}
