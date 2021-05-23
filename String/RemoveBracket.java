package String;

public class RemoveBracket {
    public static void removeBrackets(String s) {
    	String s1 = "";
    	for (int i = 0; i < s.length(); i++) {
    		char c = s.charAt(i);
			if (c=='('||c==')'||c=='{'||c=='}'||c=='['||c==']') {
				continue;
			}else {
				s1 = s1 + c;
			}
		}
    	
    	System.out.println(s1);
    }
	public static void main(String[] args) {
             removeBrackets("[{1*(15+24)}]");
	}

}
