package String;

public class CharactersToAppendForPalindrme {

	public static void main(String[] args) {
		   String s = "abcdc";
		   String required = "";
		   char charArray[] = s.toCharArray(); 
			 
		 for (int i = 0; i < charArray.length; i++) {
				    String str = "";
				     
			for (int j = i; j < charArray.length; j++) {
					str = str + charArray[j]; 
			}
				
				if (isPalindrome(str)==1) {
					System.out.println(required);
					break;
				}
				
				 required = charArray[i]+required;
				
		 } 
	}

	private static int isPalindrome(String s) {
		char arr[] = s.toCharArray();
		String r = "";
	
		for (int i = 0; i<s.length(); i++) {
			r = s.charAt(i)+r;
		}

        if (s.equals(r)) {
			return 1;
		}else {
			return 0;
		}
	}
}