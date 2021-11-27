package Array;
public class LongestPalindrome {
    
	public static void longestPalindrome(int a[]) {
		int longest = 0;
		int length  = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (isPalindrome(a[i])==true && length(a[i])>length) {
				  longest = a[i];
				  length  = length(a[i]);
			}
		}
		System.out.println(longest);
	}
	public static boolean isPalindrome(int a) {
			int num = a;
			int   x = 0;
			int sum = 0;
			
			while (a>0) {
				x = a%10;
			  sum = sum*10 + x;
				a = a/10;
			}
			
			if (sum==num) {
				return true;
			}else {
				return false;
			}
			
	}
	public static int length(int a) {
		int l = 0;
		while(a>0) {
			a = a/10;
			l++;
		}
		return l;
		
	}
	
	public static void main(String[] args) {
       
		int a [] = {124,35,6,1234554321,2,121,12321,458,74,56,555,41}; 
		longestPalindrome(a);
	}
}
