package HyKim;
import java.util.Scanner;
public class ex24 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("소인수분해 할 수를 입력하세요. : ");
		int num = sc.nextInt();
		System.out.print(num+" = ");
		int number=num;
		int i=1;
		
		while(num!=1) {
		for(i=2; i<=num; i++) {
			if(num%i==0) {
				num=num/i;
				if(num==1) {
					break;
				}
				System.out.print(i+"*");
				break;
			}
		}
	}
		if(i==number) {
			System.out.print(1+"*"+number);
		}else {
			System.out.print(i);
		}
	}
}
