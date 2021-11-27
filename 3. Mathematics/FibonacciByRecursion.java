package Mathematics;

public class FibonacciByRecursion {
	
	public static void fibonacci(int n) {
		int a = 1;
		fibo(1,1,n);
	}
	
	public static void fibo(int a,int b,int n) {
		if (b>n) {
			return;
		}
		
		System.out.println(b);
		int c = a + b;
	    a = b;
	    b = c;
		fibo(a,b,n);
		}
	
	public static void main(String[] args) {
		fibonacci(1000);
	}
}
