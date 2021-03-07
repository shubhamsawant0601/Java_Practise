package Array;
public class SmallestElement {
	
	public static void smallestOf(int a[]) {
		int smallest = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]<smallest) {
				smallest = a[i];
			} 
		}
		
		System.out.println("smallest element is "+smallest);
	}

	public static void main(String[] args) {
		int a[] = {12,45,74,58,6,54,5,9,14,7,8,5,3,45,5,65,23,662,4,8,3,3,256,45,6,3,24,66};
        smallestOf(a);
	}

}
