package SHyang;

import java.util.Scanner;

public class fes_30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int[][] arr = new int[input][input];

		for(int r=0;r<arr.length;r++)
			for(int i=0; i<arr[r].length; i++) {
				if(r%2==0) {
					arr[r][i]=(r*arr.length)+(i+1);
				}else {
					arr[r][i]=(r*arr.length)+(-i+arr.length);
				}
			}
		
		for(int r=0;r<arr.length;r++) {
			for(int i=0; i<arr[r].length;i++) {
				System.out.print(arr[r][i]+"\t");
			}
			System.out.println();
		}
	}
}
