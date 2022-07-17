package CKjung;

import java.util.Scanner;

public class my_Question_9 {
    public static void main(String[] args) {
        // ceaser 암호
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = sc.nextInt();
		
		String result = caesar(s, n);
		System.out.println(result);
		sc.close();
	}

	private static String caesar(String s, int n) {
		char s_arr [] = s.toCharArray();
		String result = "";
		for (int i = 0; i < s_arr.length; i++) {
			if (Character.isUpperCase(s_arr[i])) {
				result += (char)(((int) s_arr[i] - (int) 'A' + n)%26 + (int) 'A');
			} else if (Character.isLowerCase(s_arr[i])){
				result += (char)(((int) s_arr[i] - (int) 'a' + n)%26 + (int) 'a');
			} else {
				result += s_arr[i];
			}
		}		
		return result;
	}
}
