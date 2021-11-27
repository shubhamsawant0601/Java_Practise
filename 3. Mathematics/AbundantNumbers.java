package Mathematics;

public class AbundantNumbers {
	public static void isAbundant(int a) {
		int sum = 0;
		for (int i = 1; i <a; i++) {
			if (a%i==0) {
				sum = sum + i;
			}
		}
		if (sum>a) {
			System.out.println("Abundant");
		}else {
			System.out.println("Not Abundant");
		}
	}

	public static void main(String[] args) {
		isAbundant(12);
		isAbundant(30);
		isAbundant(48);
		isAbundant(54);
		isAbundant(108);
		isAbundant(120);
		isAbundant(114);
		isAbundant(96);
		isAbundant(13);
		isAbundant(21);
		isAbundant(28);
		isAbundant(49);
		isAbundant(8);
		isAbundant(10);
		isAbundant(119);
		isAbundant(103);

	}

}
