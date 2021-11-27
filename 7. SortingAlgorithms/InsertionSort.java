package SortingAlgorithms;

public class InsertionSort {
	public static void insertionSort(int[] array) {
	    
		for (int i = 1; i < array.length; i++) {
	        int current = array[i];
	        int j = i - 1;
	       
	        while(j >= 0 && current < array[j]) {
	            array[j+1] = array[j];
	            j--;
	        }
	        // at this point we've exited, so j is either -1
	        // or it's at the first element where current >= a[j]
	        array[j+1] = current;
	    }
	}
	public static void main(String[] args) {
		int a[] = {5,2,9,7,8,6,4,3};
		insertionSort(a);
		
		for (int i= 0;  i< a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
}
