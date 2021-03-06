package numbers;

public class FindSumSquareOfNNumbers {
   
	public static int sumOfSquares(int n) {
    	return (n*(n+1)*(2*n+1))/6;
    }
	
	public static void main(String[] args) {
		int a = sumOfSquares(6);
		int b = sumOfSquares(7);
		
		System.out.println("sum of squares of 6 no. are "+a);
		System.out.println("sum of squares of 7 no. are "+b);

	}
}
