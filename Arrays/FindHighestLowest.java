package array;

public class FindHighestLowest {

	public static void main(String[] args) {
		int a[] = {20,15,16,14,12,13,11,100,19,0};
		
		boolean sorted = false;
		while(sorted==false) {
			sorted = true;
			for (int i = 0; i < a.length-1; i++) {
				if (a[i]>a[i+1]) {
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					sorted = false;
				}
			}
		}
		
		System.out.println(a[0]+" is Lowest no. and Highest no. is "+a[a.length-1]);
	}

}
