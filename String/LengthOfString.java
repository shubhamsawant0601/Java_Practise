package String;

public class LengthOfString {
   static int length(String s) {
    	char c[]=s.toCharArray();
    	int l = 0;
    	while(l<c.length) {
    		l++;
    	}
    	return l;
    }
	public static void main(String[] args) {
		
		System.out.println(length("Shu"));

	}

}
