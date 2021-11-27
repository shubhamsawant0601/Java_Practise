package Mathematics;

import java.util.Scanner;

public class ArithmeticProgression {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("(a) = ");int a = sc.nextInt();
		System.out.print("(d) = ");int d = sc.nextInt();
		System.out.print("(l)  = ");int l = sc.nextInt();
		
		while (a<=l) {
			System.out.println(a);
			a = a+d;
		}
		
  }
}
