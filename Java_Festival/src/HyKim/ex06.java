package HyKim;
import java.util.Scanner;
public class ex06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		
		String num = sc.next();
		int sum=0;
		
		for(int i=0; i<8; i++) {
			sum+=num.charAt(i)-48;
		}
		System.out.println("합은 "+sum+"입니다.");

	}

}
