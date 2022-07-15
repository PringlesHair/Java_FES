package SHyang;

import java.util.Scanner;

public class fes_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반올림 전 값 : ");
		int be = sc.nextInt();
		
		int af = be%100%10;
		System.out.println("반올림 후 값 : "+(af>=5?be+(10-af):be-af));
		
	}

}
