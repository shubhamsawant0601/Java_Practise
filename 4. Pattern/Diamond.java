package Pattern;
public class Diamond {

	public static void main(String[] args) {
		
		int x = 10;

// upper 	
		for (int i = 0; i < x; i++) {
		
			for (int j = x; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= (i*2) ; j++) {
				System.out.print("*");
			}
			
			System.out.println();

		}
		
// lower
		
       for (int i = 1; i < x; i++) {
    	   
    	   for (int j = 0; j <= i; j++) {
    		   System.out.print(" ");
		   }
    	   
    	   for (int j = (x-i)*2-1; j > 0 ; j--) {
    		   System.out.print("*");
	       }
    	   
    	   System.out.println();
		
	    }
 
	
  }
}
