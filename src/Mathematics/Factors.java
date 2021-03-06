package Numbers;

public class Factors {
	public static void factorsOf(int a) {
		for (int i = 1; i <=a; i++) {
			if (a%i==0) {
				System.out.print(i+",");
			}
		}
		
	}

	public static void main(String[] args) {
		factorsOf(8);
		System.out.println();
		factorsOf(16);
		System.out.println();
		factorsOf(5);
		System.out.println();
		factorsOf(11);
		System.out.println();
		factorsOf(12);
		System.out.println();
		factorsOf(20);
		System.out.println();
		factorsOf(100);
	}
}
