package Mathematics;

public class HashadNumbers {
	public static void isHarshad(int a) {
		int n = a;
		int sum = 0;
		while(a>0) {
			n = a%10;
			sum = sum + n;
			a = a/10;
		}
		if (a%sum==0) {
			System.out.println("Harshad");
		}else {
			System.out.println("Not Harshad");
		}
	}

	public static void main(String[] args) {
		isHarshad(1);
		isHarshad(2);
		isHarshad(3);
		isHarshad(4);
		isHarshad(5);
		isHarshad(6);
		isHarshad(7);
		isHarshad(8);
		isHarshad(9);
		isHarshad(10);
		isHarshad(12);
		isHarshad(20);

	}

}
