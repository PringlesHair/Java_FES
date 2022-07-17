package CKjung;

import java.util.Scanner;

public class my_Question_10 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String result = change124(n);
		System.out.println(result);
		sc.close();
	}

	private static String change124(int n) {
		String result = "";
		
		while (n > 0) {
			int mod = n%3;
			n /= 3;
			if (mod != 0) {
				result = mod + result;
			} else {
				result = 4 + result;
				n--;
			}
		}
		return result;
	}
}
