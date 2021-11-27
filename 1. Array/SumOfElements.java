package Arrays;
public class SumOfElements {
	
	public static void sumOfElements(int a[]) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("sum of all elements in array is "+ sum);
	}

	public static void main(String[] args) {
		int a[] = {12,2,3,25,14,58,52};
		
		sumOfElements(a);
	}
}
