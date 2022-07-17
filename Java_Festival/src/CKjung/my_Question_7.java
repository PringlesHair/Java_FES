package CKjung;

import java.util.Scanner;

public class my_Question_7 {
    public static void main(String[] args) {
        // 2차원 배열 회전
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int [n][n];
		int cnt = 1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = cnt;
				cnt++;
			}
		}
		
		for (int[] is : arr) {
			for (int is2 : is) {
				System.out.print(is2 + "\t");
			}
			System.out.println();
		}
		
		int rotate_arr [][] = rotate90(arr);
		System.out.println();
		for (int[] is : rotate_arr) {
			for (int is2 : is) {
				System.out.print(is2 + "\t");
			}
			System.out.println();
		}
		
	}

	private static int[][] rotate90(int[][] arr) {
		int rotate_arr[][] = new int [arr.length][arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				rotate_arr[arr[i].length-1-j][i] = arr[i][j];
			}
		}
		return rotate_arr;
	}
}
