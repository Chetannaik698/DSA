public class CountUniqueDublicte {

    public static void countUniqueAndDublicte(int arr[]) {
        int unique = 0;
        int dublicte = 0;
        boolean visited[] = new boolean[arr.length];

        for(int i=0; i<arr.length; i++) {

            if (visited[i]) {
                continue;
            }
            int count = 1;
            for(int j=i+1; j<arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            if (count > 1) {
                dublicte++;
            }else{
                unique++;
            }
        }

        System.out.println("Dublicates = " + dublicte);
        System.out.println("Unique = " + unique);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 2, 8, 9, 10 };
        countUniqueAndDublicte(arr);
    }
}
