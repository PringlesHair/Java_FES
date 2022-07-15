package SHyang;

public class fes_08 {

	public static void main(String[] args) {
		int[]point = {92,32,52,9,81,2,68};
		
		int min = 1000;
		int dis = 0;
		int a = 0;
		int b = 0;
		
		for(int i=0; i<point.length-1; i++) {
			for(int r=i+1; r<point.length; r++){
				dis = (point[i]>point[r]) ? (point[i]-point[r]) : (point[r]-point[i]);
				if(min>dis){
					min = dis;
					a = i;
					b = r;
				}
				
			}
		}
			System.out.println("result = ["+a+","+b+"]");

		}

	}


