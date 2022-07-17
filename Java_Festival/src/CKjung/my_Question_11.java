package CKjung;

import java.util.Scanner;

public class my_Question_11 {
    public static void main(String[] args) {
        // 모래시계 모양 알파벳
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char arr [][] = new char [n][n];
		char cnt = 'A';
		
		int start = 0;
		int end = arr.length;
		int mid = arr.length / 2;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = start; j < end; j++) {
				arr[i][j] = cnt;
				cnt++;
			}
			if (i < mid) {
				start++; end--;
			} else {
				start--; end++;
			}
		}
		
		for (char[] cs : arr) {
			for (char cs2 : cs) {
				System.out.print(cs2 + "\t");
			}
			System.out.println();
		}
		
		
	}
}
