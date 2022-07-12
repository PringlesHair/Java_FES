import java.util.Scanner;

public class Question_23 {
    public static void main(String[] args) {
        // 단순구현 -- 누적곱
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int num = sc.nextInt();
        int total = 1;

        for (int i = 1; i <= num; i++) {
            total *= i;
        }
        System.out.println("출력 : " + total);
        sc.close();
    }
}
