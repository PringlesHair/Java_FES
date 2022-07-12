import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("최대 공약수 & 최소 공배수 구하기");
        System.out.print("숫자 1 입력 >> ");
        int first = sc.nextInt();
        System.out.print("숫자 2 입력 >> ");
        int second = sc.nextInt();

        int gcd1 = get_gcd_common(first, second); // 쉬운 방법
        int gcd2 = get_gcd(first, second); // 유클리드 호제법
        int gcd3 = recursive_gcd(first, second); // 재귀함수 이용하는 방법

        System.out.println("생각하기 쉬운 방법");
        System.out.println("최대공약수 : " + gcd1);
        System.out.println("최소공배수 : " + (first * second) / gcd1);

        System.out.println();
        System.out.println("유클리드 호제법 이용");
        System.out.println("최대공약수 : " + gcd2);
        System.out.println("최소공배수 : " + (first * second) / gcd2);

        System.out.println();
        System.out.println("재귀함수 이용");
        System.out.println("최대공약수 : " + gcd3);
        System.out.println("최소공배수 : " + (first * second) / gcd3);
        sc.close();

    }

    // 떠올리기 쉬운 방법
    private static int get_gcd_common(int n, int m) {
        int gcd = 0;
        // 항상 n이 더 작은 값, m이 더 큰값
        if (n > m) {
            int tmp = n;
            n = m;
            m = tmp;
        }
        // 최대 공약수는 더 작은 값의 약수임
        for (int i = 1; i < n + 1; i++) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
            }
        }
        return gcd; // 최대공약수 리턴
    }

    // 유클리드 호제법을 이용한 최대공약수 구하는 방법
    private static int get_gcd(int n, int m) {
        int x = n;
        int y = m;
        // 항상 x가 더 작은 값, y가 더 큰값이 되도록 (사실 이부분은 없어도 됨)
        if (x > y) {
            int tmp = x;
            x = y;
            y = tmp;
        }
        // 유클리드 호제법 (요게 핵심)
        while (y > 0) {
            int tmp = x;
            x = y;
            y = tmp % y;
        }
        return x; // 최대공약수 리턴
    }

    // 재귀 함수와 유클리드 호제법을 이용한 방법
    private static int recursive_gcd(int n, int m) {
        if (m == 0) {
            return n;
        }
        return recursive_gcd(m, n % m);
    }

}
