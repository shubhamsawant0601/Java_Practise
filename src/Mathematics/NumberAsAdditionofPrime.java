package Numbers;

public class NumberAsAdditionofPrime {
	
	public static void primeAdd(int n) {
		boolean primeadd = false;
	
		for (int i = 2; i <= n/2; i++) {
			if (isPrime(i)==true) {
				if (isPrime(n-i)==true) {
					primeadd = true;
					System.out.println(n+" = "+i+" + "+(n-i));
				}
			}
		}
		if (primeadd==false) {
		System.out.println(n+" cannot be expressed as a sum of two prime numbers");
		}
	}
		
		public static boolean isPrime(int n) {
			boolean prime = false;
			for (int i = 2; i <= n/2+1; i++) {
				if (n%i==0) {
					prime = false;
					break;
				}else {
					prime = true;
				}
			}
			
			if (n==2 || prime == true) {
				return true;
			}
			else {
				return false;
			}
		}
		
	public static void main(String[] args) {
          primeAdd(34);
          primeAdd(23);
	}

}
