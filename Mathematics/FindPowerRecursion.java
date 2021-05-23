package Mathematics;
public class FindPowerRecursion {
	
	public static int power(int number,int power) {
		if (power==1) {
			return number;
		}
		
		return number*power(number,power-1);
	}
	
	public static void main(String[] args) {	
		int ans = power(5,3);
		System.out.println(ans);
	}
}
