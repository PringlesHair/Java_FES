package EjKIM;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1.소프트웨어 설계 >> ");
		int so = sc.nextInt();
		System.out.print("2.소프트웨어 개발 >> ");
		int ex = sc.nextInt();
		System.out.print("3.데이터베이스 구축 >> ");
		int db = sc.nextInt();
		System.out.print("4.프로그래밍 언어 활용 >> ");
		int pr = sc.nextInt();
		System.out.print("5.정보시스템 구축관리 >> ");
		int in = sc.nextInt();
		int sum = so + ex + db + pr + in;
		if(so>=8 && ex>=8 && db>= 8 && pr >= 8 && in >= 8 && sum >=60) {
			System.out.println("합격입니다!");
		}else {
			System.out.println("탈락입니다...");
		}
		
	}

}
