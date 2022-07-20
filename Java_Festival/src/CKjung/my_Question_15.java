package CKjung;

import java.util.Scanner;

public class my_Question_15 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[][] = new int[n][n];
		int cnt = 1;		
		int start = n/2;
		int end = n/2;
		int mid = n/2;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = start; j <= end; j++) {
				arr[j][i] = cnt;
				cnt++;
			}
			if (mid > i) {
				start--; end++;
			} else {
				start++; end--;
			}
		}
		
		for (int[] is : arr) {
			for (int is2 : is) {
				System.out.print(is2 + "\t");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
