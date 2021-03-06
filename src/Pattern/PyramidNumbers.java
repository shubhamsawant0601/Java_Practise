package Patterns;

public class PyramidNumbers {

	public static void main(String[] args) {
		int row = 5 ;
		int num = 0;
		for (int i = 1; i <row; i++) {
			for (int j = i; j <row; j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= i; j++) {
				num++;
				System.out.print(num+" ");
			}
			
			System.out.println();
		}
   }
}