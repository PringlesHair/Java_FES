package CKjung;

import java.util.Scanner;

public class Question_26 {
    public static void main(String[] args) {
        // 단순 구현
        Scanner sc = new Scanner(System.in);
        System.out.print("n 입력 : ");
        int n = sc.nextInt();
        int cur_val = 1; // 누적합 알고리즘 응용문제

        for (int i = 0; i < n; i++) {
            cur_val += i;
            System.out.print(cur_val + " ");    
        }

        sc.close();
    }
}
