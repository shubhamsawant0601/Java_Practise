package MapandSet;
import java.util.HashMap;
import java.util.Map;

public class RepeatingAndNOnRepeatingChar {
    public static void repeatingOf(String s) {
    	HashMap<Character,Integer> h = new HashMap<Character,Integer>();
    	
    	for (int i = 0; i < s.length(); i++) {
			if (h.containsKey(s.charAt(i))){
				h.put(s.charAt(i), h.get(s.charAt(i))+1);
			}else {
				h.put(s.charAt(i), 1);
			}
		}
    	
    	for(Map.Entry<Character,Integer> i : h.entrySet()) {
    		if (i.getValue()>1) {
				System.out.println(i.getKey());
			}
    	}
    }
    
    public static void nonRepeatingOf(String s) {
    	HashMap<Character,Integer> h = new HashMap<Character,Integer>();
    	
    	for (int i = 0; i < s.length(); i++) {
			if (h.containsKey(s.charAt(i))){
				h.put(s.charAt(i), h.get(s.charAt(i))+1);
			}else {
				h.put(s.charAt(i), 1);
			}
		}
    	
    	for(Map.Entry<Character,Integer> i : h.entrySet()) {
    		if (i.getValue()==1) {
				System.out.println(i.getKey());
			}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		repeatingOf("Shubham Sawant");
		System.out.println();
		nonRepeatingOf("Shubham Sawant");
	}

}
