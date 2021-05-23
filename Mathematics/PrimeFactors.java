package Mathematics;

public class PrimeFactors {

	public static void main(String[] args) {
// Prime factors of following numbers 
		int x = 60;
        boolean prime = false;
        
		for (int i = 2; i <= x; i++) {
			prime = true;
			int a = i;
			for (int j = 2; j <= a/2; j++) {
				if (i%j==0) {
					prime = false;
					break;
				}
				else {
					prime = true;
				}
			}
			
			if (prime && x%i==0) {
				System.out.println(a);
			}
		}
	}
}
