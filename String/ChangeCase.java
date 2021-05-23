package String;

public class ChangeCase {
	public static void toUpperCase(String s) {
		StringBuilder sb = new StringBuilder(s);
		String lst = "abcdefghijklmnopqrstuvwxyz";
		String ust = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	   
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			int  index = i;
			
			for (int j = 0; j < lst.length(); j++) {
				  if (a==lst.charAt(j)) {
		       		  char b = ust.charAt(j);
		       		  sb.setCharAt(index, b);		
		       	      }
			}
		    }
		System.out.println(sb);
	}
	public static void toLowerCase(String s) {
		StringBuilder sb = new StringBuilder(s);
		String lst = "abcdefghijklmnopqrstuvwxyz";
		String ust = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	   
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			int  index = i;
			
			for (int j = 0; j < lst.length(); j++) {
				  if (a == ust.charAt(j)) {
		       		  char b = lst.charAt(j);
		       		  sb.setCharAt(index, b);		
		       	      }
				
			}
		    }
		System.out.println(sb);
	}

	public static void main(String[] args) {
        String s = "shubham";
        String t = "SHUBHAM";
        
        toUpperCase(s);
        toLowerCase(t);
	}
}
