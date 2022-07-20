package CKjung;

import java.util.Scanner;

public class Question_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("구하고 싶은 약수를 입력하시오 : ");
        int num = sc.nextInt();

        // use_usual(num); // 일반적인 방법, 출력형식을 지켜야한다면 이렇게 해야됨
        use_root(num); // 약수를 구하는 효율적인 알고리즘

        sc.close();
    }

    private static void use_usual(int num){ 
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " : ");
            for (int j = 1; j <= i; j++) {
                if (i%j==0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

    private static void use_root(int num){
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " : ");
            for (int j = 1; j < Math.sqrt(i)+1; j++) { 
                // 어떤 수의 약수는 그 수의 제곱근 까지만 검사해도 구할 수 있음
                if (i%j == 0) {
                    if (i/j != j) {
                        // 제곱수가 아니라면 약수와 해당수를 약수로 나눈 수를 구하면 효율적으로 약수 구하기 가능
                        System.out.print(j + " ");
                        System.out.print(i/j + " ");
                    } else {
                        // 제곱수는 한번만 output
                        System.out.print(j + " ");
                    }
                }
            }
            System.out.println();
        }
    }


}
