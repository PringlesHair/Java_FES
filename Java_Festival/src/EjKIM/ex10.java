package EjKIM;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반올림 전 값 : ");
		int num = sc.nextInt();

		System.out.print("반올림 후 값 : ");

		if(num%100%10 >=5) {
			System.out.print(num-(num%100%10)+10);
		
		}else{
			System.out.print(num-(num%100%10));
		};
	}

}
