public class Question_12 {
    public static void main(String[] args) {
        // 단순 구현문제
        answer(100); // 출력형식을 맞춘 정답
        test_tmp(100); // 조금 다른 방식으로 result만 얻는 방법
        
    }
    private static void answer(int n){
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                result -= i;
                System.out.print("-" + i + " ");
            } else {
                result += i;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("결과 : " + result);
    }

    private static void test_tmp(int n) {
        // 1~n 까지의 덧셈 뺄셈을 문제에서 제시
        // 단순 result 값만 구한다고 했을 때 훨씬 효율적으로 구하는 방법
        int result = n * (n + 1) / 2;
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum -= i;
        }
        System.out.println(result+sum*2);
    }
}
