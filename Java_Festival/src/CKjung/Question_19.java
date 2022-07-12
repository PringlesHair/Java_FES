public class Question_19 {
    public static void main(String[] args) {
        // 단순 구현 -- 누적합?
        int total = 0;
        int dest = 77;
        for (int i = 1; i <= 77; i++) {
            total += dest*i;
            dest--;
        }
        System.out.println(total);
        
    }
}
