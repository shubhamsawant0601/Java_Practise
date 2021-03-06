package numbers;

public class MissingNumber {

	public static void main(String[] args) {
        int a[] = {1,5,3,2,6,4,8,9,7,11,13,10};
        
        boolean sorted = false;
        while (sorted!=true) {
			sorted = true;
			for (int i = 0; i < a.length-1; i++) {
				if (a[i]>a[i+1]) {
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1]=temp;
					sorted=false;
				}
			}
		}
        int n = 1;
        for (int i = 0; i < a.length; i++) {
			if (a[i]!=n) {
				System.out.println(n);
			    n++;
			}
			n++;
		}

	}

}
