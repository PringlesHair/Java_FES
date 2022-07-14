package HyKim;
import java.util.Scanner;
public class ex20 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] student = new int[5];
		
		System.out.print("java 점수 : ");
		student[0]=sc.nextInt();
		System.out.print("web 점수 : ");
		student[1]=sc.nextInt();
		System.out.print("and 점수 : ");
		student[2]=sc.nextInt();
		
		student[3]=student[0]+student[1]+student[2];
		student[4]=student[3]/3;
		
		System.out.println("java : "+student[0]);
		System.out.println("web : "+student[1]);
		System.out.println("and : "+student[2]);
		System.out.println("sum : "+student[3]);
		System.out.println("avg : "+student[4]);

	}

}
