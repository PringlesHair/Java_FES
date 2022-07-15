package SHyang;

import java.util.Random;

public class fes_03 {

		public static void main(String[] args) {

			int [] array = new int[8];
			Random rd = new Random();	
			
			System.out.print("배열에 있는 모든 값 : ");
				
			int max = 0;
			int min = 100;
			
			for(int i = 0; i<=7; i++) {
				int num = rd.nextInt(99)+1;
				array[i]=num;
				System.out.print(array[i]+" ");
				
				if(max<num) {
					max=num;
				}
				
				else if(min>num) {
					min=num;
				}

			}
			System.out.println();
			System.out.println("가장 큰 값 : "+max);
			System.out.println("가장 작은 값 : "+min);
			
			
			}
		}
