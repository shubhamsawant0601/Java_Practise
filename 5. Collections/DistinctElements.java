package MapandSet;
import java.util.HashMap;
import java.util.Map;
public class DistinctElements {
    public static void distinctOf(int a[]) {
    	HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
    	
    	for (int i = 0; i < a.length; i++) {
			if (h.containsKey(a[i])) {
				h.put(a[i], h.get(a[i])+1);
			}else {
				h.put(a[i], 1);
			}
		}
    	
    	for(Map.Entry i :h.entrySet()) {
    	     System.out.println(i.getKey());
    	}
    }
	public static void main(String[] args) {
		int a[]= {1,2,1,2,3,4,5,5,6,4,7,8,2,3,6,5,4,1,2,3,6,5,4,7,8,6,6,2,4,5,6,7,8,9,1,};
        distinctOf(a);

	}

}
