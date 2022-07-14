package HyKim;
public class ex08 {
	public static void main(String[] args) {
		
		int[] point= {92,32,52,9,81,2,68};
		int min=999; 
		int distance=0; 
		int idx1=0;	
		int idx2=0; 
		
		for(int i=0; i<point.length-1; i++) {
			for(int j=i+1; j<point.length; j++) {
				distance = (point[i]>point[j]) ? point[i]-point[j] : point[j]-point[i];
				if(min>distance) { 
					min=distance;
					idx1=i; 
					idx2=j;
				}
			}
		}
		System.out.println("result = ["+idx1 + "," + idx2 + "]");
	}

}
