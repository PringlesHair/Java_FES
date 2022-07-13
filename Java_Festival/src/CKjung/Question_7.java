import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("행 개수 : ");
        int row = sc.nextInt();

        // use_loop(row); // 중첩 반복
        // use_String(row); // repeat 함수 이용
        use_cal(row); // 계산을 통해 반복문을 하나만 이용하는 방법
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

    private static void use_cal(int row){
        // 반복문을 하나만 이용하는 방법
        int star_cnt = row * (row + 1) / 2; // 가우스 덧셈을 이용 총 찍는 별의 개수를 구함
        int tmp_row = row; 
        // enter를 치는 경우는 7번째 별 -> 13번째 별 -> 18번째 별 ....
        // 따라서 row 값에 7,6,5,..로 작아지는 수를 더해주고 row값을 갱신

        for (int i = 1; i < star_cnt+1; i++) {
            System.out.print("*");
            if (i == row) {
                System.out.println();
                tmp_row--;
                row = row + tmp_row;
            }
        }
    }
}
