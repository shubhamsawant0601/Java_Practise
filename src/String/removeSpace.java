package Strings;

public class removeSpace {
    public static void removeSpaces(String s) {
    	String s1 = "";
    	for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)!= ' ') {
				s1 = s1 + s.charAt(i);
			}
		}
    	System.out.println(s1);
    }
	public static void main(String[] args) {
		removeSpaces("   Sh u bh   a m S aw a  nt");

	}
}
