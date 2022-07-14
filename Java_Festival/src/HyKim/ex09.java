package HyKim;
import java.util.Scanner;
public class ex09 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번쨰 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번쨰 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		boolean result = isDivide(num1, num2);
		System.out.println("결과 확인 : " +result);

	}
	public static boolean isDivide(int num1, int num2) {
		if(num1%num2==0) {
			return true;
		}else {
			return false;
		}
	}

}
