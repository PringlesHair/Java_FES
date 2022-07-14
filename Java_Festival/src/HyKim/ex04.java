package HyKim;
import java.util.Scanner;
public class ex04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 입력>>");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 입력>>");
		String num2 = sc.next();
		
		System.out.println(num1*(num2.charAt(2)-48));
		System.out.println(num1*(num2.charAt(1)-48));
		System.out.println(num1*(num2.charAt(0)-48));
		System.out.println(num1*((num2.charAt(2)-48)+(num2.charAt(1)-48)*10+(num2.charAt(0)-48)*100));
		
		
	}

}
