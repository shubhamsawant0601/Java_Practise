package numbers;

public class PrimeTwinNo {
	public static void twinPrimeUpTo(int n) {
		boolean twinPrime = false;
		for (int i = 2; i <= n; i++) {
			twinPrime = false;
			int a = i;
			int b = i+2;
			for (int j = 2; j <= a/2+1; j++) {
				if (a % j == 0 || b % j == 0) {
					twinPrime = false;
					break;
				}else {
					twinPrime = true;
				}
			}
			if (twinPrime) {
			   System.out.println("("+a+","+(a+2)+")");
			}
		}
	}
	public static void main(String[] args) {
		 twinPrimeUpTo(100);

	}

}
