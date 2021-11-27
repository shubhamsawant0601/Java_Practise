package MapandSet;
import java.util.HashMap;
import java.util.Map;
public class FreqOfCharacters {
	public static void freqOfCharacters(String s) {
    HashMap<Character,Integer> h = new HashMap<Character,Integer>();
    
    for (int i = 0; i < s.length(); i++) {
    	if (h.containsKey(s.charAt(i))) {
			h.put(s.charAt(i), h.get(s.charAt(i))+1);
		}else {
			h.put(s.charAt(i), 1);
		}
    }
    
    for(Map.Entry i : h.entrySet()) {
    	System.out.println(i.getKey()+" : "+i.getValue());
    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        freqOfCharacters("Shubham Sawant");
	}

}
