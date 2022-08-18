/*
Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order.
Essentially, rearrange the digits to create the highest possible number.

Examples:

Input: 42145 Output: 54421

Input: 145263 Output: 654321

Input: 123456789 Output: 987654321
 */


import java.util.ArrayList;
import java.util.Collections;

public class descending {
    public static int sortDesc(final int num) {
        int temp = num;
        ArrayList<Integer> array = new ArrayList<Integer>();

        do{
            array.add(temp % 10);
            temp /= 10;
        } while  (temp > 0);

        int begin = 0, end = array.size();

        Collections.sort(array);
        Collections.reverse(array);
        int res=0;

        for(int i = 0;i < array.size();i++) {
            res = res * 10 + array.get(i);
        }

        return res;
    }
    public static void main(String[] args) {
        System.out.println(sortDesc(18723817));
    }
}
