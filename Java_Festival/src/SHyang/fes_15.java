package SHyang;

import java.util.Scanner;

public class fes_15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재금액 : ");
		int pr = sc.nextInt();
		
		System.out.println("잔돈반환");
		System.out.print("10000원 : "+pr/10000+"개"+"\n");
		System.out.print("5000원 : "+pr%10000/5000+"개"+"\n");
		System.out.print("1000원 : "+pr%10000%5000/1000+"개"+"\n");
		System.out.print("500원 : "+pr%10000%5000%1000/500+"개"+"\n");
		System.out.print("100원 : "+pr%10000%5000%1000%500/100+"개");
		
	}

}
