package array;

public class FindMeanMedianMode {
// to find mean
	public static void mean(int a[]) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum +=  a[i];
		}
		double mean = (double)sum/a.length;
		System.out.println(mean);
	}
// to find median
	public static void median(int a[]) {
		boolean sorted=false;
		while (!sorted) {
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
		double median = 0;
		if (a.length%2 == 0) {
			median = (double)(a[a.length/2-1]+a[(a.length/2)])/2;
		}else {
			median = (double)(a[a.length/2]); 
		}
		
		System.out.println(median);
	}
// to find mode
	public static void mode(int a[]) {
		int maxFre = 0;
		int visited = -1;
		int mode = 0;
		for (int i = 0; i < a.length; i++) {
			int x = a[i];
			int count = 0;
			if (x!=visited) {
				for (int j = i+1; j < a.length; j++) {
					if (x==a[j]) {
						count++;
						a[i] = visited;
						
					}
					if (count>maxFre) {
						mode = x;
					}
				}
			}
		}
		System.out.println(mode);
	}

	public static void main(String[] args) {
		int a[] = {5,6,5,6,5,2,4,3,8,8,8,8};
		
		mean(a);
		median(a);
		mode(a);

	}

}
