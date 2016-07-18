import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class HashMapPractice {

	public static void main(String[] args) {
		
		int sum = 9;
		int count = 0;
		int[] ar = {1,3,5,3,6,8,3,5,9,6,4,5};
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer> ();
		for(int i = 0; i < ar.length; i++) {
			map.put(ar[i], i);
		}
		
		for(int i = 0; i < ar.length; i++) {
			if(map.get(sum - ar[i]) != i) {
				count ++;
			}
		}
		System.out.println(count);
		/*for(Entry<Integer, Integer> j : map.entrySet()) {
			Integer key = j.getKey();
			Integer value = j.getValue();
			
			
		}*/
		System.out.println(map);
		
		
		// TODO Auto-generated method stub

	}

}
