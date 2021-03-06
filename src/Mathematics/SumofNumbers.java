package Numbers;
public class SumofNumbers {

	public static void sumOfRange(int n,int m) {
		int sum = 0;
		for (int i = n; i <= m; i++) {
			  sum = sum + i;
		}
		System.out.println("sum is "+sum);
	}
	
	public static void main(String[] args) {
		sumOfRange(1,100);
		sumOfRange(2,4);
		sumOfRange(50,75);
		sumOfRange(1,54);
		sumOfRange(1,6);
		
}
}