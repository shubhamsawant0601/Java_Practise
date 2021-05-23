package Mathematics;

public class LCMandGCDbyRecursion {
	public static void LCMandGCD(int a,int b) {
		int max = a>b?a:b;
		int min = a<b?a:b;
		int LCM = LCM(max,a,b);
		int GCD = GCD(min,a,b);	
		System.out.println("LCM = "+LCM+" & GCD = "+GCD);
	}
	
// function to find LCM  
	private static int LCM(int n,int a,int b) {
		if (n%a==0 && n%b==0) {
			return n;
		}
		return LCM(n+1,a,b);
	}

// function to find GCD
	private static int GCD(int n,int a,int b) {
		if (a%n==0 && b%n==0) {
			return n;
		}
		return GCD(n-1,a,b);
	}


	public static void main(String[] args) {
		LCMandGCD(60,100);
	}
}
