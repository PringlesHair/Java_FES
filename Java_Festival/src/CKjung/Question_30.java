package CKjung;

import java.util.Scanner;

public class Question_30 {
    public static void main(String[] args) {
        // 단순 구현 문제
        // 이 외에도 다양하게 있으니까 꼴리는대로 구현해보세용~
        Scanner sc = new Scanner(System.in);
        System.out.print("input number : ");
        int n = sc.nextInt();
        sc.close();

        int arr [][] = new int [n][n];
        int cnt = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i%2 == 0) {
                    arr[i][j] = cnt;
                    cnt++;
                }else{
                    arr[i][arr[i].length-1-j] = cnt;
                    cnt++;
                }
            }
        }

        for (int[] is : arr) {
            for (int is2 : is) {
                System.out.print(is2 + "\t");
            }
            System.out.println();
        }
    }
}
