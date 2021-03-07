package Array;

import java.util.Arrays;

public class ArraySimilarity {
	public static void isArraySimilar(int[]a,int[]a1) {
		Arrays.sort(a);
		Arrays.sort(a1);
		boolean same = false;
		
		
		for (int i = 0; i < a1.length; i++) {
			if (a[i]==a1[i]) {
				same = true;
			}else {
				same = false;
				break;
			}
		}
		
		if (same&& a.length==a1.length) {
			System.out.println("Similar");
		} else {
			System.out.println("Not Similar");
		}
		
		
	}

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,0}; 
		int a1[] = {4,5,3,6,0,1,2}; 

		isArraySimilar(a,a1);

	}

}
