/*
Reverse string program
Example : elpmaxE

Explanation:
We use XOR
(A XOR B) XOR B = A
(A XOR B) XOR A = B

let's imagine this
arr[high] = 'x'
double digit code will be 1111000
arr[high] = 'n'
double digit code will be 1101110
in our cycle will be:
1. arr[low] = (char) (arr[low] ^ arr[high]);
    arr[low] =  1 1 0 1 1 1 0
    arr[high] = 1 1 1 1 0 0 0
    arr[low] =  0 0 1 0 1 1 0
2. arr[high] = (char) (arr[low] ^ arr[high]);
    arr[low] =  0 0 1 0 1 1 0
    arr[high] = 1 1 1 1 0 0 0
    arr[high] = 1 1 0 1 1 1 0
3.arr[low] = (char) (arr[low] ^ arr[high]);
    arr[low] =  0 0 1 0 1 1 0
    arr[high] = 1 1 0 1 1 1 0
    arr[low] =  1 1 1 1 0 0 0
in the end we switch two of our symbol
 */
public class Main {
    public static String solution(String str) {
        char[] arr = str.toCharArray();
        int low = 0;
        int high = arr.length - 1;
        String result = "";
        while (low < high) {
            arr[low] = (char) (arr[low] ^ arr[high]);
            arr[high] = (char) (arr[low] ^ arr[high]);
            arr[low] = (char) (arr[low] ^ arr[high]);
            low++;
            high--;
        }
        for (int i = 0; i < arr.length; i++) {
            result = result + arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        String answer;
        System.out.println(answer = solution("hello"));

    }


}