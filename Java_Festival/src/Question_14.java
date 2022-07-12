import java.util.Scanner;

public class Question_14 {
    public static void main(String[] args) {
        // 단순 구현 문제

        Scanner sc = new Scanner(System.in);
        System.out.print("input number : ");
        int n = sc.nextInt();
        int arr[][] = new int [n][n];
        int cnt = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[j][i] = cnt;
                cnt++;
            }
        }

        for (int[] is : arr) {
            for (int is2 : is) {
                System.out.print(is2 + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
