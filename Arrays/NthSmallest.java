package Array;

public class NthSmallest {
	
	public static void NthSmallest(int n, int a[]) {
		int temp ;
		boolean sorted = false;
// sorting
		while(sorted==false) {
			sorted=true;
			for (int i = 0; i < a.length-1; i++) {
				if (a[i]>a[i+1]) {
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					sorted = false;
				}
			}
		}
// nth smallest
		System.out.println(n+"th smallest is "+a[n-1]);	

	}
	
	public static void NthLargest(int n, int a[]) {
		int temp ;
		boolean sorted = false;
// sorting
		while(sorted==false) {
			sorted=true;
			for (int i = 0; i < a.length-1; i++) {
				if (a[i]<a[i+1]) {
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					sorted = false;
				}
			}
		}
// nth smallest
		System.out.println(n+"th largest is "+a[n-1]);	

	}

	public static void main(String[] args) {
             int a[] = {12,2,3,25,14,58,52};
             
             NthSmallest(1,a);
             NthSmallest(2,a);
             NthSmallest(3,a);
             NthSmallest(4,a);
             NthSmallest(5,a);
             
             NthLargest(1,a);
             NthLargest(2,a);
             NthLargest(3,a);
             NthLargest(4,a);
             NthLargest(5,a);
             
	}

}
