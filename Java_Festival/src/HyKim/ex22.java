package HyKim;
import java.util.Scanner;
public class ex22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 몸무게를 입력하시오 : ");
		int current = sc.nextInt();
		System.out.print("목표 몸무게를 입력하시오 : ");
		int goal = sc.nextInt();
		int i=1;
		int loss=0;
		while(current>goal) {
			System.out.print(i+"주차 감량 몸무게 입력 : ");
			loss=sc.nextInt();
			current-=loss;
			i++;
		}
		System.out.println(i-1+"주차 다이어트 성공 !!!");
	}

}
