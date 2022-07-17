package CKjung;

import java.util.Scanner;

public class my_Question_12 {
    public static void main(String[] args) {
        // 모래시계 모양 별 찍기
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int start = 0;
		int end = n;
		int mid = n / 2;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < start; j++) {
				System.out.print(" " + "\t");
			}
			for (int j = start; j < end; j++) {
				System.out.print("*" + "\t");
			}
			System.out.println();
			if (i < mid) {
				start++; end--;
			} else {
				start--; end++;
			}
		}
		
	}
}
