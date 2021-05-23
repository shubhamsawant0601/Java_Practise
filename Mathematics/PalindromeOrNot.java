package Mathematics;

public class PalindromeOrNot {
	public static void isPalindrome(int n) {
		int m = n;
		int a = 1;
		int sum = 0;
		while (m!=0) {
			a = m%10;
			sum = sum*10+a;
			m = m/10;
		}
		if (sum==n) {
			System.out.println(n+ " Palindrome");
		}else {
			System.out.println(n+ " Not Palindrome");
		}
	}

	public static void main(String[] args) {

        isPalindrome(123321);
        isPalindrome(1234321);
        isPalindrome(4444444);
        isPalindrome(65477456);
        isPalindrome(3578753);
        isPalindrome(456856);
        isPalindrome(11235465);
	}

}
