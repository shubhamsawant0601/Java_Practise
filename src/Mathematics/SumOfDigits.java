package Numbers;
public class SumOfDigits {
	
	public static void sumOfDigits(int n) {
		int sum =0;
		int number = n;
		while(n>0) {
			int a = n%10;
			sum += a;
			n = n/10;
		}
		System.out.println("Sum of digits of "+number+" is "+sum);
	}
	public static void main(String[] args) {
	      sumOfDigits(154);
	      sumOfDigits(546);
	      sumOfDigits(100);
	      sumOfDigits(85);
	      sumOfDigits(64);

	}
}
