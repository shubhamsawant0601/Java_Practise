package Mathematics;

public class PalindromeOrNotRecursion {
	public static String isPalindrome(int n) {
		int sum = 0;
		int reverse = reverse(n,sum);
		
		if (reverse==n) {
			return "Palindrome";
		}else {
			return "Not Palindrome";
		}
	}
	public static int reverse(int n,int sum) {
		int x = n;	
		int a=0;
		
		if (x==0) {
			return sum;
		}
	    a=n%10;
		sum=sum*10+a;
		x=x/10;
	    
		return reverse(x,sum);
	}

	public static void main(String[] args) {
		//Palindrome	
		System.out.println(isPalindrome(12321));
		System.out.println(isPalindrome(654456));
		System.out.println(isPalindrome(874545478));
		System.out.println(isPalindrome(546645));
		System.out.println(isPalindrome(528825));

		//Not Palindromes 
		System.out.println("");
		System.out.println(isPalindrome(345));
		System.out.println(isPalindrome(6458));
		System.out.println(isPalindrome(456812));
		System.out.println(isPalindrome(1851));
		System.out.println(isPalindrome(1264521));
	}

}
