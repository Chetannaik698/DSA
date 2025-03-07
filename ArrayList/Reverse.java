package ArrayList;

import java.util.ArrayList;

public class Reverse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(18);

        int max = Integer.MIN_VALUE;
        for(int i=0; i<=list.size()-1; i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println("Max: " + max);
    }
}
