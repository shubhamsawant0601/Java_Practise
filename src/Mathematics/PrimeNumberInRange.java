package Numbers;
public class PrimeNumberInRange {
	
	public static void primeInRange(int x, int y) {
		int n=0;
		boolean prime = false;
		
		if (x<2 || x==2) {
			System.out.print("2,");
		}
		for (int i = x; i <=y ; i++) {
			 n = i; 
			 prime = false;
			
			 for (int j = 2; j < n; j++) {
				if (n%j==0) {
					prime = false;
					break;
				}else {
					prime = true;
				}
			 }
			 
			 if (prime==true) {
				System.out.print(n+",");
			}		
		}
	}
	
	
	public static void main(String[] args) {
		primeInRange(10,100);
		
	}
}
