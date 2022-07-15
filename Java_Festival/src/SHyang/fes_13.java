package SHyang;

import java.util.Scanner;

public class fes_13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구하고 싶은 약수를 입력하시오 : ");
		int num = sc.nextInt();
		
		for(int r=1; r<=num; r++) {
			System.out.print(r+" : ");		
			for(int i=1; i<=num; i++) {
				if(r%i==0) {
					System.out.print(i+" ");
				}
			}System.out.println();
		}
	}
}
