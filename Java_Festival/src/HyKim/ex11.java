package HyKim;
import java.util.Scanner;
public class ex11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1.소프트웨어 설계 >> ");
		int a = sc.nextInt();
		System.out.print("2.소프트웨어 개발 >> ");
		int b = sc.nextInt();
		System.out.print("3.데이터베이스 구축 >> ");
		int c = sc.nextInt();
		System.out.print("4.프로그래밍 언어 활용 >> ");
		int d = sc.nextInt();
		System.out.print("5.정보시스템 구축관리 >> ");
		int e = sc.nextInt();
		
		if(a+b+c+d+e >=60 && (a>=8 && b>=8 && c>=8 && d>=8 && e>=8)) {
			System.out.println("합격입니다!");
		}else {
			System.out.println("탈락입니다...");
		}
	}

}
