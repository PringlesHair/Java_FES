import java.util.Scanner;

public class Question_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input number : ");
        int input = sc.nextInt();

        for (int i = 1; i <= input; i++) {
            System.out.print(fibo_recursive(i) + " ");
        }
        sc.close();
    }

    private static int fibo(int idx){
        // 가장 일반적인 피보나치 수열 구하는법
        if (idx == 1 || idx == 2) {
            return 1;
        } else {
            int before = 1;
            int after = 1;
            for (int i = 2; i < idx; i++) {
                int tmp = before;
                before = after;
                after = tmp + after;
            }
            return after;
        }
    }

    private static int fibo_recursive(int idx){
        // 재귀함수로 피보나치 수열 구하는법
        if (idx == 1 || idx == 2) {
            return 1;
        } else {
            return fibo_recursive(idx-1) + fibo_recursive(idx-2);
        }
    }
}
