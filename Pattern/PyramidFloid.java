package Pattern;

public class PyramidFloid {

	public static void main(String[] args) {
	         int row = 5;
	         int count = 1;
	         for (int i = 1; i <=row; i++) {
				
	        	 for (int j = 1; j <=i; j++) {
					System.out.print(count+" ");
					count ++;
				}
	        	 
	        	 System.out.println();
			}
	}

}
