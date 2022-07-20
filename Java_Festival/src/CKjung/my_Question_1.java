package CKjung;

import java.util.HashMap;
import java.util.Map;

public class my_Question_1 {
    public static void main(String[] args) {
        // 해당 문자열에서 A 몇개, B 몇개 ..
		// python Counter
        // https://coding-factory.tistory.com/556
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		
		String score_arr[] = score.split(",");
		
		// java dictionary
		Map<String, Integer> counter = new HashMap<String, Integer>();
		
		for (String val : score_arr) {
			counter.put(val, (counter.get(val) == null)? 1 : counter.get(val) + 1);
		}
		
		for (Map.Entry<String, Integer> entry : counter.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key + " : " + val);
			
		}
    }
}
