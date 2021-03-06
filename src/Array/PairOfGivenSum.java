package array;

public class PairOfGivenSum {

	public static void main(String[] args) {
		int a[]= {1,5,3,6,4,7,9,8,2};
		
		System.out.println("Pairs giving sum 10");
		
		for (int i = 0; i < a.length; i++) {
			int x = a[i];
			for (int j = i+1 ; j < a.length; j++) {
				if (x+a[j]==10) {
					System.out.println(x+", "+a[j]);
				}
			}
		}

	}

}
