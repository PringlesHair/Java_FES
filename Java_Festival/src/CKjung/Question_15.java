package CKjung;

import java.util.Scanner;

public class Question_15 {
    public static void main(String[] args) {
        // 단순 구현문제
        Scanner sc = new Scanner(System.in);

        System.out.print("현재금액 : ");
        int money = sc.nextInt();

        int money_arr[] = { 10000, 5000, 1000, 500, 100 };

        System.out.println("잔돈변환");

        for (int i : money_arr) {
            System.out.println(i + "원 : " + money / i + "개");
            money = money % i;
        }

        sc.close();
    }
}
