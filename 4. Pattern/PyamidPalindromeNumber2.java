package Pattern;

public class PyamidPalindromeNumber2 {

	public static void main(String[] args) {
          int row = 5;
          
          for (int i = 1; i <=5; i++) {
        	  for (int j = row; j >i; j--) {
				System.out.print("  ");
			  }
        	  for (int j = i; j <=2*i-1; j++) {
				System.out.print(j+" ");
			  }
        	  for (int j = 2*i-2; j >=i; j--) {
				System.out.print(j+" ");
			  }
        	  
			System.out.println();
		}
	}

}
