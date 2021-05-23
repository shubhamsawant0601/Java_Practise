package Mathematics;

public class Palindrome {
	public static void isPalindrome(int n) {
		int number = n;
		int reverse = 0;
		int a ;
		
		while(n>0) {
			a = n%10;
			reverse = reverse*10 + a;
			n = n/10;
		}
		if (reverse==number) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}
	public static void main(String[] args) {
		isPalindrome(34566543);
		isPalindrome(12344321);
		isPalindrome(12321);
		isPalindrome(14521);
		isPalindrome(85647);
		isPalindrome(100);
	}
}
