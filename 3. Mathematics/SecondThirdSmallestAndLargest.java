package Mathematics;

public class SecondThirdSmallestAndLargest {
	
	public static void SecondThirdSmallest(int a[]) {
		int smallest = Integer.MAX_VALUE;
		int secondsmall = Integer.MAX_VALUE;
		int thirdsmall = Integer.MAX_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]<smallest) {
				smallest=a[i];
			}
		    }
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]<secondsmall && a[i]>smallest) {
				secondsmall = a[i];
			}  	
		    }
	
		for (int i = 0; i < a.length; i++) {
			if (a[i]<thirdsmall && a[i]>secondsmall) {
				thirdsmall = a[i];
			}
		    }
		System.out.println("Second Third Smallest "+secondsmall+", "+thirdsmall);
		
	}
	public static void SecondThirdLargest(int a[]) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]>first) {
				first = a[i];
			}
			}
		for (int i = 0; i < a.length; i++) {
			if (a[i]>second && a[i]<first) {
				second = a[i];
			}
			}
		for (int i = 0; i < a.length; i++) {
			if (a[i]>third && a[i]<second) {
				third = a[i];
			}
		    }
		 System.out.println("Second Third Largest "+second+", "+third);
	}

	public static void main(String[] args) {
		int a[] = {5,6,4,8,1,2,3,7,9,45,25,100};
		
		SecondThirdLargest(a);
		SecondThirdSmallest(a);

	}

}
