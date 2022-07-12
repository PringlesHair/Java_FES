import java.util.Scanner;

public class Question_27 {
    public static void main(String[] args) {
        // 단순 구현 문제
        Scanner sc = new Scanner(System.in);

        int arr [] = new int [5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i+1 + "번째 입력 : ");
            arr[i] = sc.nextInt();
        }

        for (int i : arr) {
            System.out.print(i + " : ");
            for (int j = 0; j < i; j++) {
                System.out.print("*"); // 앞에서 했던 repeat 함수로도 구현해 보세용!!
            }
            System.out.println();
        }
        sc.close();
    }
}
