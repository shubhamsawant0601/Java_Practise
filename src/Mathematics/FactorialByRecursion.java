package numbers;

public class FactorialByRecursion {

	public static void factorial(long a) {
		long x = factorialfunction(a);
		System.out.println(x);
	}
	
	public static long factorialfunction(long a) {
		if (a==0) {
			return 1;
		}
		return a*factorialfunction(a-1);
	}

	public static void main(String[] args) {
		long x = 15;
		factorial(x);
    }
}
