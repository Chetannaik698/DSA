public class SubString {

    public static String subString(String str, int si, int ei) //starting and ending index 
    {
         String substr = "";
         for(int i=si; i<ei; i++){
            substr += str.charAt(i);
         }
         return substr;
    }
    public static void main(String[] args) {
         String str = "HelloWorld";
         System.out.println(subString(str, 0, 5));
         //in built method
         System.out.println(str.substring(0, 5));
    }
}