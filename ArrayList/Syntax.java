package ArrayList;

import java.util.ArrayList;

public class Syntax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        //Add elements => O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4); 

        System.out.println(list);

        //Get operations => O(1)
        int ele = list.get(0);
        System.out.println(ele);

        //Remove element => O(n)
        list.remove(2);
        System.out.println(list);

        //set element at index => O(n)
        list.set(2, 10);
        System.out.println(list);

        //Contains element => O(n)
        System.out.println(list.contains(1));

        System.out.println(list.size());

        for(int i=0; i<=list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
