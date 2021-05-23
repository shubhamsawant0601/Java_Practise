package MapandSet;
import java.util.HashMap;
import java.util.Map;
public class ArrayElementFreq {
	
	public static void freqOfEachElement(int a[]) {
		HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
		
		for (int i = 0; i < a.length; i++) {
			if (h.containsKey(a[i])) {
				h.put(a[i], h.get(a[i])+1);
			}else {
				h.put(a[i], 1);
			}
		}
		
		for(Map.Entry i :h.entrySet()) {
			System.out.println(i.getKey()+" : "+i.getValue());
		}
	}

	public static void main(String[] args) {
              int a[] = {25,36,25,36,25,36,14,14,14,1,5};
              freqOfEachElement(a);
              
	}
}
