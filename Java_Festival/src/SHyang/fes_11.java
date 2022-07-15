package SHyang;
import java.util.Scanner;

public class fes_11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("1. 소프트웨어 설계 >> ");
		int sw = sc.nextInt();
		System.out.print("2. 소프트웨어 개발 >> ");
		int de = sc.nextInt();
		System.out.print("3. 데이터베이스 구축 >> ");
		int db = sc.nextInt();
		System.out.print("4. 프로그래밍 언어 활용 >> ");
		int pg = sc.nextInt();
		System.out.print("5. 정보시스템 구축관리 >> ");
		int is = sc.nextInt();
		
		int sum = sw+de+db+pg+is;
		
		if(sum>=60 && sw>=8 && de>=8 && db>=8 && pg>=8 && is>=8) {
			System.out.println("합격입니다!");
		}else {
			System.out.println("탈락입니다...");
		}
		
	}

}
