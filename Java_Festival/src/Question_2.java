import java.util.GregorianCalendar;
import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("년도 입력 >> ");
        int year = sc.nextInt();

        use_conditional(year); // 단순 조건문 활용
        // use_Gregorian(year); // Gregorian Calendar 이용

        sc.close();
    }

    private static void use_conditional(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("윤년");
        } else {
            System.out.println("윤년 아님");
        }
    }

    private static void use_Gregorian(int year) {
        // Gregorian Calendar 이용
        // https://needneo.tistory.com/73
        // https://jamesdreaming.tistory.com/98
        // etc...
        GregorianCalendar gc = new GregorianCalendar();
        if (gc.isLeapYear(year)) {
            System.out.println("윤년");
        } else {
            System.out.println("윤년 아님");
        }
    }
}
