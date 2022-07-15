package SHyang;

import java.util.Scanner;

public class fes_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사려는 상품개수를 입력하세요 >> ");
		int num = sc.nextInt();
		int pr = num*10000;
		
		System.out.print("가격은 ");
		if (num<=11) {
			System.out.print(pr);
		}else {
			System.out.print((int)(pr*0.9));
		}System.out.println("원 입니다.");
		
		
		
	}

}
