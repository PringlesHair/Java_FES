package SHyang;

import java.util.Scanner;

public class fes_26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n 입력 : ");
		int n = sc.nextInt();
		
		int r = 1;
		for(int i=0;i<=n-1;i++) {
			 r+=i;
			System.out.print(r+" ");
		}
		
		
	}
}
