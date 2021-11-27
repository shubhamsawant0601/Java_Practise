package Arrays;

import java.util.Scanner;

public class SumOfDigonalElementsOfMatrix {
	
	public static void SumOfDigonalElements(int a[][]) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i][i];
		}
		System.out.println("Sum of Digonal Element is "+sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no. rows ");
		int rows = sc.nextInt();
		System.out.println("Enter no. columns ");
		int columns = sc.nextInt();
		
		int a[][] = new int [rows][columns];
		
		for (int i = 0; i < rows; i++) {
			System.out.println("Enter row "+i);
			for (int j = 0; j < columns; j++) {
				a[i][j]=sc.nextInt();
			}	
		    }

		SumOfDigonalElements(a);
		
	}
}
