package ArrayList;

import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        
        System.out.println(list);
        Collections.sort(list); //ascending
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder()); //reverse
        System.out.println(list);
    }
}
