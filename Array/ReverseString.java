package Array;

public class ReverseString {
	
	public static String Reverse(String s) {
	    String r = "";
	    
	    for (int i = 0; i < s.length(); i++) {
			 r = s.charAt(i)+r;
		}
	    return r;
	}

	public static void main(String[] args) {
	   
		String r = Reverse("Shubham");
        System.out.println(r);
	}
}
