import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("행 개수 : ");sssss
        int row = sc.nextInt();

        // use_loop(row); // 중첩 반복
        use_String(row); // repeat 함수 이용
    }

    private static void use_loop(int row) {
        for (int i = row; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void use_String(int row) {
        for (int i = row; i >= 0; i--) {
            System.out.println("*".repeat(i));
        }
    }
}
