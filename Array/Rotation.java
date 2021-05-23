package Array;

public class Rotation {
	public static void rotateLeft(int a[],int n) {
		int r = 0;
		while (r<n) {
			int first = a[0];
			for (int i = 0; i < a.length-1; i++) {
				a[i] = a[i+1];
			}
			a[a.length-1] = first;
			r++;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public static void rotateRight(int a[],int n) {
		int r = 0;
		while (r<n) {
			int last = a[a.length-1];
			for (int i =  a.length-1; i >0; i--) {
				a[i] = a[i-1];
			}
			a[0] = last;
			r++;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a[] = {1,2,3,4,5,6}; 
         
         rotateLeft(a,2);
         System.out.println();
         rotateRight(a,5);
	}

}
