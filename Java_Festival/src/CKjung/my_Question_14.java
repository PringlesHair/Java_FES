package CKjung;

import java.util.Random;
import java.util.Scanner;

public class my_Question_14 {
    public static void main(String[] args) {
        // 2차원 배열 내에 있는 랜덤값 중 최댓값 뽑기
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int n = sc.nextInt();
		
		int arr[][] = new int [n][n];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rd.nextInt(99)+1;
			}
		}
		
		for (int[] is : arr) {
			for (int is2 : is) {
				System.out.print(is2 + "\t");
			}
			System.out.println();
		}
		
		int max = 0;
		int row = 0;
		int col = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] > max) {
					row = i; col = j;
					max = arr[i][j];
				}
			}
		}
		System.out.println(row + " " +  col);
	}
}
