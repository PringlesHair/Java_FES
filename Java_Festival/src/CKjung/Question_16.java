public class Question_16 {
    public static void main(String[] args) {
        // 단순 구현 문제
        int startValue = 2;
        int endValue = 1000;

        getPerfectNumber(startValue, endValue);
    }

    private static void getPerfectNumber(int startValue, int endValue){
        System.out.print(startValue + "~" + endValue + "까지의 완전수 : ");
        for (int i = startValue; i <= endValue; i++) {
            int sum = 0;
            for (int j = 1; j < Math.sqrt(i)+1; j++) {
                // 약수는 그 수의 제곱근까지만 검사하면 효율적으로 검사가능
                if (i % j == 0) {
                    if (j != i/j) {
                        sum += j;
                        sum += i / j;
                    }else{
                        sum += j;
                    }
                }
            }
            sum -= i; //완전수는 자기 자신은 빼야됨
            if (i == sum) {
                System.out.print(i + " ");
            }
        }
    }
}
