package SHyang;

import java.util.Scanner;

public class fes_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int num = sc.nextInt();
		
		for(int r = num; r>=1; r--){
			for(int i = 1; i <= r; i++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
