package array;

public class RotateClockwiseAnticlockwise {
	public static void Rotate(int a[],int n) {
// to rotate clockwise
		if (n>0) {
		System.out.println("Rotated clockwise "+(n)+" Times");
            for (int i = 0; i < n; i++) {			
            	int x = a[a.length-1];
            	for (int j = 0; j < a.length-1; j++) {
					a[a.length-1-j] = a[a.length-2-j];
				}
            	a[0] = x;
			}
		    }
// to rotate anti clockwise
		if (n<0) {
		System.out.println("Rotated Anticlockwise "+(-n)+" Times");
		   for (int i = 0; i < (-n); i++) {
			   int x = a[0];
			   for (int j = 0; j < a.length-1; j++) {
				    a[j] = a[j+1];
			    }
			   a[a.length-1] = x;
		     }
	         }
// to print array 	
        System.out.print("[");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+",");
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		
		Rotate(a,1);
		Rotate(a,2);
		Rotate(a,3);
		Rotate(a,4);
		Rotate(a,-1);
		Rotate(a,-2);
	}
}
