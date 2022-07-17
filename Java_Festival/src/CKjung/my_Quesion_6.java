package CKjung;

import java.util.Scanner;

public class my_Quesion_6 {
    public static void main(String[] args) {
        // 멀리 뛰기 문제 (programmers)
        // 결국 피보나치 수열 구하기 문제
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int result = jumpCase(n);
		
		System.out.println(result);
	}

	private static int jumpCase(int n) {
		int before = 1;
		int after = 1;
		
		for (int i = 1; i < n; i++) {
			int tmp = before;
			before = after;
			after = tmp + after;
		}
		return after;
	}
}
