package Sorting;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3, 0, 0, 0 };
        int nums2[] = { 2, 5, 6 };

        int n = 3;
        int m = 3;

        int auxil[] = new int[m + n];

        for (int i = 0; i < m; i++) {
            auxil[i] = nums1[i];
        }

        for (int i = 0; i < n; i++) {
            auxil[m + i] = nums2[i];
        }

        Arrays.sort(auxil);
        
        for(int i=0; i<auxil.length; i++) {
            nums1[i] = auxil[i];
        }

        for (int i = 0; i < auxil.length; i++) {
            System.out.print(auxil[i] + " ");
        }


    }
}
