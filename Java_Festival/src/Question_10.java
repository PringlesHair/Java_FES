import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("반올림 전 값 : ");
        int num = sc.nextInt();

        // System.out.println("반올림 후 값 : " + cal_result(num)); // 계산
        System.out.println("반올림 후 값 : " + math_result(num)); // Math

        sc.close();
    }

    private static int cal_result(int num){
        int n = num%10;
        // 사사오입 반올림
        if (n >= 5) {
            return num + (10-n);
        } else {
            return num - n;
        }
    }

    private static int math_result(int num){
        // 부정확할 수 있음 -- 컴퓨터는 짝수를 좋아해!
        return (int) Math.round(num*0.1)*10;
    }
}
