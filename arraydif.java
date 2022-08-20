/*
Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.

It should remove all values from list a which are present in list b keeping their order.Your goal in this kata is to implement
 a difference function, which subtracts one list from another and returns the result.

It should remove all values from list a which are present in list b keeping their order.
 */


import java.util.Arrays;

public class arraydif {

    public static int[] arrayDiff(int[] a, int[] b) {
        System.out.println(a[0]);
        System.out.println(Arrays.toString(a));
        int del_count = 0;
        for (int k = 0; k < a.length; k++) {
            for (int i = 0; i < b.length; i++) {
                if (a[k] == b[i]) {
                    del_count++;
                    System.out.println("Find you" + a[k] + b[i]);
                    for(int j = k; j < a.length - 1; j++){
                        a[j] = a[j+1];
                    }
                    k--;
                }
            }
        }
        int[] c = new int[a.length-del_count];
        for(int i = 0; i < a.length-del_count;i++){
            c[i] = a[i];
        }
        return c;
    }
    public static void main(String[] args) {
        int[]a = {1,2,2,3,3,4,4,5,5,6,7};
        int[]b = {2,3,5,6,4};
        System.out.println(Arrays.toString(arrayDiff(a, b)));

    }

}