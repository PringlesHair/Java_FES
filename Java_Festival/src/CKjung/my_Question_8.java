package CKjung;

import java.util.Scanner;

public class my_Question_8 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		
		String num_arr [] = n.split("");
		int num_dict [] = {6,2,5,5,4,5,6,3,7,6};
		
		int sum = 0;
		
		for (String val : num_arr) {
			sum += num_dict[Integer.parseInt(val)];
		}
		
		System.out.println(sum);
		
	}
}
