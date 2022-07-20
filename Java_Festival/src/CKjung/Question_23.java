package CKjung;

import java.util.Scanner;

public class Question_23 {
    public static void main(String[] args) {
        // 단순구현 -- 누적곱
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int num = sc.nextInt();

        int total = use_loop(num);
        // int total1 = use_recursive(num);

        System.out.println("출력 : " + total);
        sc.close();
    }

    private static int use_recursive(int num) {
        if (num > 0) {
            return num * use_recursive(num-1);
        } else {
            return 1;
        }
    }

    private static int use_loop(int n){
        int total = 1; // 누적곱
        for (int i = 1; i <= n; i++) {
            total *= i;
        }
        return total;
    }
}
