package Mathematics;

public class Power {
	public static void power(int a, int b) {
		int n = 1;
		int power = 1;
		
		while(n<=b) {
			power = power*a;
		}
		
		System.out.println(power);
	}
	public static void main(String[] args) {
		power(5,2);
		power(2,5);
		power(3,2);
		power(3,4);
		power(2,3);
		power(10,3);

	}
}
