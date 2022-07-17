package CKjung;

import java.util.Scanner;

public class my_Question_16 {
    public static void main(String[] args) {
        // 숫자의 표현
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

//		int result = expressions(n);
		int result = expressions2(n);

		System.out.println(result);
	}

	private static int expressions2(int n) {
		int result = 0;
		
		for (int i = 1; i <= n; i += 2) {
			if (n%i == 0) {
				result += 1;
			}
		}
		return result;
	}

	private static int expressions(int n) {
		int result = 0;
		
		for (int i = 1; i <= n; i++) {
			int temp_sum = 0;
			for (int j = i; j <= n+1; j++) {
				temp_sum += j;
				if (temp_sum == n) {
					result += 1;
					break;
				} else if (temp_sum > n) {
					break;
				}
			}
		}
		return result;
	}
}
