package HyKim;
import java.util.Scanner;
public class ex05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m=0;
		int n=0;
		System.out.print("숫자1입력>>");
		int num1 = sc.nextInt();
		
		System.out.print("숫자1입력>>");
		int num2 = sc.nextInt();
		
		int a = num1>num2 ? num1 : num2;
		
		for(int i=2; i<=a; i++) {
			if(num1%i ==0 && num2 %i==0) {
				m=i;
			}
		}
		n=m*(num1/m)*(num2/m);
		System.out.println("최대공약수: "+m);
		System.out.println("최소공배수: "+n);
	}

}
