package Numbers;

public class StrongNumber {
	public static void isStrong(int a) {
		int n = a;
		int x = 0;
		int sum = 0;
		while(a>0) {
			x = a%10;
			int fact=1;
			for (int i = 1; i <= x; i++) {
				fact = fact*i;
			}
			sum = sum + fact;
			a = a/10;
		}
		
		if (sum==n) {
			System.out.println("Strong");
		}else {
			System.out.println("Not Strong");
		}
	}

	public static void main(String[] args) {
		isStrong(124);
		isStrong(145);
		isStrong(21);
		isStrong(2);
		isStrong(12);
		isStrong(1);
		isStrong(24);
		isStrong(40585);

	}
}
