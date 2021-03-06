package Array;

public class FindDuplicateNo {

	public static void main(String[] args) {
		int a[]= {12,12,14,15,16,18,17,20,19,19,19};
		int b[]= new int[a.length/2];
		int count = 0;
		int l = 0;
		boolean counted = false;
		
		for (int i = 0; i < a.length; i++) {
			count = 0;
			counted = false;
			int x = a[i];
			
			for (int j = 0; j < b.length; j++) {
				if (b[j]==x) {
					counted = true;
					break;
				}
				else {
					counted = false;
				}
			}
			if (counted==false) {
			for (int j = i+1; j < a.length; j++) {
				if (a[j]==x) {
					count++;
				}
			}
			if (count!=0) {
				b[l] = x;
				l++;
				System.out.println(x+" repeated "+count+" times ");
			}
			}
		}     
	}
}
