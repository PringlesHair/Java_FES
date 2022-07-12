import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();

        // System.out.println("합은 " + use_loop(num) + "입니다."); // 반복문을 이용한 풀이
        System.out.println("합은 " + use_arr(num) + "입니다.");

        sc.close();
    }

    private static int use_loop(int num) {
        // 반복문을 이용한 풀이 -- 가장 효율성 좋은듯
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    private static int use_arr(int num) {
        // 배열을 이용한 풀이
        String arr[] = Integer.toString(num).split("");
        int sum = 0;
        for (String val : arr) {
            sum += Integer.parseInt(val);
        }
        return sum;
    }
}
