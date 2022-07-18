package javaFE;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		int num1 = num/10000000;
		int num2 = num%10000000/1000000;
		int num3 = num%10000000%1000000/100000;
		int num4 = num%10000000%1000000%100000/10000;
		int num5 = num%10000000%1000000%100000%10000/1000;
		int num6 = num%10000000%1000000%100000%10000%1000/100;
		int num7 = num%10000000%1000000%100000%10000%1000%100/10;
		int num8 = num%10000000%1000000%100000%10000%1000%100%10;
		System.out.println("합은" + (int)(num1+num2+num3+num4+num5+num6+num7+num8) + "입니다.");
	}

}
