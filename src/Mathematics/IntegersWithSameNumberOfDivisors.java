package Numbers;

public class IntegersWithSameNumberOfDivisors {
	public static void integersWithSameDivisors(int divisors, int range) {
		System.out.println("numbers with "+divisors+" divisors in range 1 to "+range);
		for (int i = 1; i <= range; i++) {
			int num = i;
			int count = 0;
			for (int j = 1; j <= num; j++) {
				if (num%j==0) {
					count++;
				}
			}
			if (count==divisors) {
				System.out.print(num+",");
			}
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		integersWithSameDivisors(3, 30); 
		integersWithSameDivisors(2, 30); 
		integersWithSameDivisors(4, 30); 
		integersWithSameDivisors(1, 30); 
	}
}
