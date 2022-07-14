package ShKang;

import java.util.Scanner;

public class JavaFestival {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		System.out.println("결과 :" + (num / 100) * 100);
	}

}