package CKjung;

import java.util.Scanner;

public class Question_18 {
    public static void main(String[] args) {
        // 단순 구현 -- 누적합
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하시오 : ");
        int num = sc.nextInt();

        use_loop(num);
        use_cal(num);

        sc.close();
    }

    private static void use_cal(int num) {
        int answer = num * (num+1) / 2;
        System.out.println("1부터 " + num + "까지의 합은 " + answer + "입니다.");
    }

    private static void use_loop(int num) {
        int answer = 0;
        for (int i = 1; i <= num; i++) {
            answer += i;
        }
        System.out.println("1부터 " + num + "까지의 합은 " + answer + "입니다.");
    }
}
