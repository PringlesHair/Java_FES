import java.util.Scanner;

public class Question_22 {
    public static void main(String[] args) {
        // 단순 구현 문제
        Scanner sc = new Scanner(System.in);
        System.out.println("----다이어트 프로그램----");
        System.out.print("현재 몸무게를 입력하시오 : ");
        int cur_weight = sc.nextInt();
        System.out.print("목표 몸무게를 입력하시오 : ");
        int target_weight = sc.nextInt();
        int week = 0;

        while (cur_weight > target_weight) {
            week++;
            System.out.print(week + "주차 감량 몸무게 입력 : ");
            int loss_weight = sc.nextInt();
            cur_weight -= loss_weight;
        }
        System.out.println(week + "주차 다이어트 성공 !!!");

        sc.close();
    }
}
