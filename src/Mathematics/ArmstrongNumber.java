package numbers;

public class ArmstrongNumber {
	public static void isArmstrong(int n) {
		int a = n;
		int b = 1;
		int sum = 0;
		while (a!=0) {
			b = a%10;
			sum = sum + (b*b*b);
			a = a/10;
		}
		if (sum==n) {
			System.out.println(n+" Armstrong");
		}else {
			System.out.println(n+" Not Armstrong");
		}
	}

	public static void main(String[] args) {
	  
		isArmstrong(153);
		isArmstrong(370);
		isArmstrong(371);
		isArmstrong(407);
		isArmstrong(0);
		isArmstrong(1);
		isArmstrong(15);
		isArmstrong(13);
		isArmstrong(53);
		isArmstrong(1543);
		isArmstrong(65);
		isArmstrong(753);
	}

}
