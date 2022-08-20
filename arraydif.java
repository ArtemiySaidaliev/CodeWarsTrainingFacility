/*
Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.

It should remove all values from list a which are present in list b keeping their order.Your goal in this kata is to implement
 a difference function, which subtracts one list from another and returns the result.

It should remove all values from list a which are present in list b keeping their order.
 */

public class arraydif {

    public static int[] arrayDiff(int[] a, int[] b) {
        for (int k : a) {
            for (int i : b) {
                if (k == i) {
                    System.out.println("Find you" + k + i);
                }
            }

        }
        return a;
    }
    public static void main(String[] args) {
        int[]a = {1,2,2};
        int[]b = {2,3};
        arrayDiff(a,b);

    }

}