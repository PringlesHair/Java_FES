import java.util.Scanner;

public class Question_17 {
    public static void main(String[] args) {
        // 단순 구현 문제
        Scanner sc = new Scanner(System.in);
        System.out.print("사려는 상품개수를 입력하세요 >> ");
        int cnt = sc.nextInt();

        if (cnt < 11) {
            System.out.println("가격은 " + cnt * 10000 + "원 입니다.");
        } else {
            System.out.println("가격은 " + (int) (cnt * 10000 * 0.9) + "원 입니다.");
        }
        sc.close();

    }
}
