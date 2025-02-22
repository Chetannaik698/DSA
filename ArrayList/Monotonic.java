package ArrayList;

import java.util.ArrayList;

public class Monotonic {

    public static boolean isMonotonic(ArrayList<Integer> list) {

        if (list.size() <= 1) {
            return true;
        }
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                increasing = false;
            }
            if (list.get(i) < list.get(i + 1)) {
                decreasing = false;
            }
        }
        return increasing || decreasing;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(4);

        System.out.println(isMonotonic(list));
    }
}
