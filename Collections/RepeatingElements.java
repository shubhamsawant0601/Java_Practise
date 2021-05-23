package MapandSet;
import java.util.HashMap;
import java.util.Map;

public class RepeatingElements {
	public static void repeatingElements(int a[]) {
		Map<Integer, Integer> h = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < a.length; i++) {
			if (h.containsKey(a[i])) {
				h.put(a[i],h.get(a[i])+1);
			}else {
				h.put(a[i], 1);
			}
		}
		
		for (Map.Entry<Integer,Integer> entry : h.entrySet()) {
			 
			 if (entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
	}
	
	public static void nonRepeatingElements(int a[]) {
          Map<Integer, Integer> h = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < a.length; i++) {
			if (h.containsKey(a[i])) {
				h.put(a[i],h.get(a[i])+1);
			}else {
				h.put(a[i], 1);
			}
		}
		for (Map.Entry<Integer,Integer> entry : h.entrySet()) {
			 
			 if (entry.getValue()==1) {
				System.out.println(entry.getKey());
			}
		}
	}


	public static void main(String[] args) {
		int a[] = {1,9,2,3,4,5,6,7,8,9,1};
		
		repeatingElements(a);
		
		System.out.println();
		
		nonRepeatingElements(a);

	}
}
