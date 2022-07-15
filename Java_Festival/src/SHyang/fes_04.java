package SHyang;

import java.util.Scanner;

public class fes_04 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("첫 번쨰 숫자 입력 >> ");
	int num1 = sc.nextInt();
	
	System.out.print("두 번째 숫자 입력 >> ");
	int num2 = sc.nextInt();
	
	int fr = num1*(num2%100%10);
	int se = num1*(num2%100/10);
	int tr = num1*(num2/100);
	int sum = fr+(se*10)+(tr*100);
	
	
	System.out.println(fr);
	System.out.println(se);
	System.out.println(tr);
	System.out.println(sum);
	
	}

}
