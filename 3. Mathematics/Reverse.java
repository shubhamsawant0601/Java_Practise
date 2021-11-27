package Mathematics;

public class Reverse {
	public static void reverse(int n) {
		int reverse = 0;
		int a ;
		while(n>0) {
			a = n%10;
			reverse = reverse*10 + a;
			n = n/10;
		}
		System.out.println(reverse);
	}
	public static void main(String[] args) {
		reverse(1234);
		reverse(54321);
		reverse(256);
		reverse(57800);
		reverse(5483);
	}
}
