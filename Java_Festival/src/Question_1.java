import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();

//        result(num);
         use_math(num);

        sc.close();
    }

    private static void result(int num) {
        System.out.println("결과 : " + (num / 100) * 100);
    }

    private static void use_math(int num) {
        // Math 사용
        // http://www.tcpschool.com/java/java_api_math
        System.out.println("결과 : " + (int) Math.floor(num * 0.01) * 100);
    }
}
