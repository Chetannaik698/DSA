package Arrays;

public class LinearSearch {

    public static int linearSearch(int numbers[], int key) {
        for(int i = 0; i<numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;

        int idx = linearSearch(numbers, key);

        if (idx == -1) {
            System.out.println("NOT found");
        }
        else {
            System.out.println("key found at the position: " + idx);
        }
    }
}
