package String;

public class Palindrome {
	
	public static void isPalindrome(String s) {
		String reverse = "";
		
		for (int i = s.length()-1; i >=0; i--) {
			reverse = reverse + s.charAt(i);
		}
		
		if (s.equals(reverse)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         isPalindrome("Shubham");
         isPalindrome("123321");
	}

}
