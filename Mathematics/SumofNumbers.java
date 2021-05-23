package Mathematics;
public class SumofNumbers {

	public static void sumOfRange(int n,int m) {
		int sum1 = m*(m+1)/2;
		int sum2 = (n-1)*(n)/2;
		System.out.println(sum1-sum2);
	
	}
	
	public static void main(String[] args) {
		sumOfRange(1,100);
		sumOfRange(2,4);
		sumOfRange(50,75);
		sumOfRange(1,54);
		sumOfRange(1,6);
		
    }
}