package Numbers;

public class PerfectNumber {
	public static void isPerfect(int a) {
		int sum = 0;
		
		for (int i = 1; i < a; i++) {
			if (a%i==0) {
				sum = sum + i;
			}
		}
		
		if (a==sum) {
			System.out.println("Perfect");
		}else {
			System.out.println("Not Perfect");
		}
		
	}

	public static void main(String[] args) {
		isPerfect(28);
		isPerfect(496);
		isPerfect(6);
		isPerfect(8128);
		isPerfect(8);
		isPerfect(1);
		isPerfect(3);
		isPerfect(20);
		isPerfect(25);
		

	}

}
