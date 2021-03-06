package Numbers;

public class GCD {
	public static void gcd(int a, int b) {
		int min = a<b?a:b;
		int gcd = 0; 
		for (int i = 1; i <=min; i++) {
			if (a%i==0 && b%i==0) {
				 gcd = i;
			}
		}
		
		System.out.println("GCD of "+a+" & "+b+" is "+gcd);
	}

	public static void main(String[] args) {
		gcd(15,35);
		gcd(100,50);
		gcd(20,25);
		gcd(12,8);
		gcd(80,120);
		gcd(11,17);
		gcd(2,5);
		gcd(23,54);

	}

}
