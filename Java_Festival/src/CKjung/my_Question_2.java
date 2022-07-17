package CKjung;

import java.util.Scanner;

public class my_Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        // 입력된 문자열에서 가운데 글자 반환
        System.out.println(getMiddle(input));

        sc.close();
    }

    private static String getMiddle(String input) {
        String input_arr [] = input.split("");
        if (input_arr.length % 2 != 0) {
            return input_arr[input_arr.length / 2];
        } else {
            int tmp = input_arr.length / 2;
            return input_arr[tmp-1] + input_arr[tmp];
        }
    }
}
