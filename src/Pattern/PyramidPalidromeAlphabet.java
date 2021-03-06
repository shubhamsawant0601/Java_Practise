package Patterns;

public class PyramidPalidromeAlphabet {

	public static void main(String[] args) {
          
		int row = 5;
		
		for (int i = 1; i <=row; i++) {
			for (int j = row; j > i; j--) {
				System.out.print(" ");
			}
            for (int j = 1; j <= i; j++) {
				System.out.print((char)(j+64));
			}
			
			for (int j = i-1; j>=1; j--) {
				System.out.print((char)(j+64));
			}
			
			
			
			System.out.println();
		}}}

	


