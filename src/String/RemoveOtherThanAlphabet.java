package Strings;

public class RemoveOtherThanAlphabet {
    public static void keepAlphabet(String s) {
    	String s1 = "";
    	for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int  asc = c;
			if (asc<=122 && asc>=97 || asc<=90 && asc>=65) {
				s1 = s1 + c;
			}
		}
     System.out.println(s1);
    }
	public static void main(String[] args) {
          keepAlphabet("!@#$%^&*()_{>S<?.,H';`~U*-B+`H`~A|?M/Shubham");
	}

}
