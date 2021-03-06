package Patterns;

public class PyramidPalindrome {

	public static void main(String[] args) {
      int row = 5;
		
      for (int i = 1; i <=row; i++) {
		
    	  for (int j = row; j>i; j--) {
			System.out.print(" ");
		  }
    	  
    	  for (int j = 1; j <=i; j++) {
			System.out.print(j);
		  }
    	  
    	  for (int j = i-1; j>=1; j--) {
			System.out.print(j);
		  }
    	  
    	  System.out.println();
	}		
	}
}
