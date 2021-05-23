package SearchingAlgorithms;
public class SearchingAlgorithms {
	public static void LinearSearch(int a[], int x) {
	    for (int i = 0; i < a.length; i++) {
			if (a[i]==x) {
				System.out.println("Element is found at "+i);
			}
			}
	}
	public static void BinarySearch(int a[],int x) {
	    boolean found = false;
		int r = 0;
		int l = a.length-1;
		int mid = (r+l)/2;
		int n = x;
		int i = 0;
		while (found==false) {
			if (a[mid]==n) {
				    i = mid;
				found = true;
			}
		    else if (n<a[mid]) {
				r = 0;
				l = mid;
				mid = (r+l)/2;
			}
			else if (n>a[mid]) {
				r = mid;
				l = l;
				mid = (r+l)/2;
			}
		}
		System.out.println("Element is found at "+i);
	}
	public static void main(String[] args) {
		int a[] = {21,25,27,35,39,45,48,51,52,65,67};
        int x = 39;
		
        LinearSearch(a,x);
        BinarySearch(a,x);   
	}
   }
	