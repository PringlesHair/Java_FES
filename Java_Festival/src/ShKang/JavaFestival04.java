package ShKang;

import java.util.Scanner;

public class JavaFestival04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println(num1*(num2%10));
		System.out.println(num1*((num2/10)%10));
		System.out.println(num1*(num2/100));
		System.out.println(num1*num2);
	}

}
