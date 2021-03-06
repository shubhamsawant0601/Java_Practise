package numbers;

public class ReverseNumber {
	public static void reverse(int a) {
		int y;
		int x = a;
		int sum = 0;
		while (x!=0) {
			y = x%10;
			sum = sum*10 + y;
			x = x/10;
		}
		System.out.println(sum);	
		}
	

	public static void main(String[] args) {
		int a = 12345;
		
		reverse(a);
		
	}
}
