package numbers;

import java.util.Scanner;

public class SwitchNumberWithoutthird {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a ");
		int a = sc.nextInt();
		System.out.println("b ");
		int b = sc.nextInt();
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("a = "+a+"\n"+"b = "+b);

	}

}
