import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자 입력 >> ");
        int first = sc.nextInt();
        // string array로 만든 다음
        System.out.print("두 번째 숫자 입력 >> ");
        int second = sc.nextInt();

        use_loop(first, second);
        // use_arr(first, second); // 배열을 이용한 풀이

        sc.close();
    }

    private static void use_loop(int first, int second) {
        // 반복문을 이용한 풀이 -- 이게 훨씬깔끔
        int orgin_second = second;
        while (second > 0) {
            System.out.println(first * (second % 10));
            second /= 10;
        }
        System.out.println(first * orgin_second);
    }

    private static void use_arr(int first, int second) {

        /*
         * 아싸리 입력받을 때 부터 두번째 숫자를 String arr로 만드는게 편함
         * System.out.print("첫 번째 숫자 입력 >> ");
         * int first = sc.nextInt();
         * // string array로 만든 다음
         * System.out.print("두 번째 숫자 입력 >> ");
         * String second [] = sc.next().split("");
         */

        String second_arr[] = Integer.toString(second).split("");

        for (int i = second_arr.length - 1; i >= 0; i--) {
            // String to integer로 형변환해서 해곃하는 방법
            // https://hianna.tistory.com/524
            System.out.println(first * Integer.parseInt(second_arr[i]));
        }
        System.out.println(first * Integer.parseInt(String.join("", second_arr)));
    }

}
