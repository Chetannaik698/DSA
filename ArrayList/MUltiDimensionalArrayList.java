package ArrayList;

import java.util.ArrayList;

public class MUltiDimensionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        //first list
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //second list
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(10);

         //Third list
         ArrayList<Integer> list3 = new ArrayList<>();
         list2.add(3);
         list2.add(6);
         list2.add(9);
         list2.add(12);
         list2.add(15);

        mainList.add(list);
        mainList.add(list2);
        mainList.add(list3);

        for(int i=0; i<mainList.size(); i++) {
            ArrayList<Integer> cuurList = mainList.get(i);
            for(int j=0; j<cuurList.size(); j++) {
                System.out.print(cuurList.get(j) + " ");
            }
            System.out.println();
        }  
    }
}
