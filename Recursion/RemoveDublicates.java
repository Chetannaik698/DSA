public class RemoveDublicates {

    public static void removeDublicte(String str, int idx, StringBuilder newStr, boolean map[]) {
        // base case
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        // work
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            // in this condition we got dublicate
            removeDublicte(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDublicte(str, idx + 1, newStr.append(currChar), map);
        }

    }

    public static void main(String[] args) {
         String str = "cheethaan";
         removeDublicte(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
