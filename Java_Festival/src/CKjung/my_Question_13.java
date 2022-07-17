package CKjung;

import java.util.Scanner;

public class my_Question_13 {
    public static void main(String[] args) {
        // 2진수 to 10진수
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

//		System.out.println(Integer.parseInt(str, 2));

		String str_arr[] = str.split("");
		int bin = 1;
		int sum = 0;

		for (int i = str_arr.length - 1; i >= 0; i--) {
			sum = sum + (Integer.parseInt(str_arr[i]) * bin);
			bin *= 2;
		}

		System.out.println(sum);
	}
}
