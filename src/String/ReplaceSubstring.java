package Strings;

public class ReplaceSubstring {
    public static void replaceSubString(String s,String sub,String newstr) {
    
    	s=s.replaceFirst(sub,newstr);
    
        System.out.println(s);
    
    }
	public static void main(String[] args) {
		
		replaceSubString("Shubham","bh","hb");

	}
}
