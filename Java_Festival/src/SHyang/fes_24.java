package SHyang;

import java.util.Scanner;

public class fes_24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("소인수분해 할 수를 입력하세요. : ");
		int n = sc.nextInt();
		System.out.print(n+" = ");
				
		for(int r=2; r<=n; r++) { 
			while(n%r==0) {
				System.out.print(r);
				n=n/r;
				if(n == 1) {
					break;		
				}else {
					System.out.print("*");
				}
			}
		}
	}
}
