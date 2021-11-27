package Array;

public class MinimumScalarProduct {
    public static void minScalarProduct(int a[],int a1[]) {
    	 a = sortAsc(a);
    	 a1 = sortDesc(a1);
    	 int sum = 0;
    	 
    	 for (int i = 0; i < a1.length; i++) {
			sum = sum + (a[i]*a1[i]);
		 }
   
         System.out.println("Max Scalar Product is "+sum);  	 
     }
     
	private static int[] sortDesc(int[] a) {
		boolean sorted = false;
		while(sorted==false) {
			sorted = true;
			for (int i = 0; i < a.length-1; i++) {
				if (a[i]<a[i+1]) {
					int temp = a[i];
					   a[i]  =  a[i+1];
			           a[i+1]= temp;
			           sorted=false;
				}
			}
			}
		
		return a;
	}

	private static int[] sortAsc(int[] a) {
		boolean sorted = false;
		while(sorted==false) {
			sorted = true;
			for (int i = 0; i < a.length-1; i++) {
				if (a[i]>a[i+1]) {
					int temp = a[i];
					   a[i]  =  a[i+1];
			           a[i+1]= temp;
			           sorted=false;
				}
			}
			}
		
		return a;
	}
	public static void main(String[] args) {
		int a [] = {1,3,3,5,2,3};
		int a1 [] = {1,4,3,5,6,7};
        
		 minScalarProduct(a,a1);
	}
}