package Array;

import java.util.Arrays;

public class MaximumScalarProduct {
    public static void maxScalarProduct(int a[],int a1[]) {
    	 a = sortAsc(a);
    	 a1 = sortAsc(a1);
    	 int sum = 0;
    	 
    	 for (int i = 0; i < a1.length; i++) {
			sum = sum + (a[i]*a1[i]);
		 }
   
         System.out.println("Max Scalar Product is "+sum);  	 
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
		int a [] = {1,2,3,6};
		int a1 [] = {3,5,1,4};
        
		 maxScalarProduct(a,a1);
	}
}
