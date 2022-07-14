package ShKang;

import java.util.Scanner;

public class JavaFestival11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("소프트웨어 설계 >>");
		int sf = sc.nextInt();

		System.out.print("소프트웨어 개발 >>");
		int sfd = sc.nextInt();

		System.out.print("데이터베이스 구축 >>");
		int db = sc.nextInt();

		System.out.print("프로그래밍 언어 활용 >>");
		int pl = sc.nextInt();

		System.out.print("정보시스템 구축관리 >>");
		int im = sc.nextInt();

		int score = db + sfd + db + pl + im;
		if (score >= 60 && db >= 8 && sfd >= 8 && db >= 8 && pl >= 8 && im >= 8) {
			System.out.println("합격입니다!");

		} else {
			System.out.println("탈락입니다...");
		}
	}

}
