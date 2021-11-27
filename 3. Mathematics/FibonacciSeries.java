package Mathematics;

public class FibonacciSeries {
	public static void fibonacciUpTo(int n) {
		int a = 0;
		int b = 1;
		int temp ;
		while(b<=n) {
			System.out.print(b+",");
			temp = a;
			   a = b;
			   b = temp + b;
			
		}
	}

	public static void main(String[] args) {
	      fibonacciUpTo(100);
        
	}

}
