package SHyang;

import java.util.Scanner;

public class fes_27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i=1; i<=5; i++) {
			System.out.print(i+"번째 입력 : ");
			int n = sc.nextInt();
			arr[i-1]=n;
		}
		
		for(int r=0; r<arr.length; r++) {
			System.out.print(arr[r]+" : ");
			for(int y=1; y<=arr[r]; y++) {
				System.out.print("*");
			}System.out.println();
		}
		
	}

}
