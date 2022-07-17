package CKjung;

import java.util.Arrays;
import java.util.Scanner;

public class my_Question_3 {
    public static void main(String[] args) {

        // 입력받은 문자열 정렬하여 반환
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        // System.out.println(reverseStr_sort(input));
        System.out.println(reverseStr_select(input));
        sc.close();
    }

    private static String reverseStr_sort(String input) {
        String input_arr[] = input.split("");
        Arrays.sort(input_arr);
        return String.join("", input_arr);
    }

    private static String reverseStr_select(String input) {
        String input_arr[] = input.split("");

        for (int i = 0; i < input_arr.length - 1; i++) {
            for (int j = i + 1; j < input_arr.length; j++) {
                int cmp = input_arr[i].compareTo(input_arr[j]);
                if (cmp > 0) {
                    String tmp = input_arr[i];
                    input_arr[i] = input_arr[j];
                    input_arr[j] = tmp;
                }
            }
        }

        return String.join("", input_arr);
    }
}
