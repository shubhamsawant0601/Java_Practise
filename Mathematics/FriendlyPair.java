package Mathematics;

public class FriendlyPair {
	public static void isFriendly(int a, int b) {
		int sum1 = 0;
		int sum2 = 0;
		
		for (int i = 1; i < a; i++) {
			if (a%i==0) {
				sum1 = sum1 + i;
			}
		}
		
		for (int i = 1; i < b; i++) {
			if (b%i==0) {
				sum2 = sum2 + i;
			}
		}
		
		if (sum1==b && sum2==a) {
			System.out.println(a+" & "+b+" is in friendly pair");
		}else {
			System.out.println("not in friendly pair");
		}
	}

	public static void main(String[] args) {
		isFriendly(220,284);
		isFriendly(30,140);
		isFriendly(66,308);
		isFriendly(84,270);
		isFriendly(80,200);
		isFriendly(40,224);
		isFriendly(12,234);


	}

}
