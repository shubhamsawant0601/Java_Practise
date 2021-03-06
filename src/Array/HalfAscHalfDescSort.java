package Array;

public class HalfAscHalfDescSort {
	public static void halfSort(int arr[]) {
//sort
		boolean sorted = false;
		while(!sorted) {
			sorted = true;
			for (int i = 0; i <arr.length-1; i++) {
				if (arr[i]>arr[i+1]) {
					   int temp = arr[i];
					     arr[i] = arr[i+1];
					   arr[i+1] = temp;
					     sorted = false;
				}
			}
		}
//reverse half
		int low=arr.length/2;
		int high=arr.length-1;
		while (low<high) {
			int temp = arr[low];
			arr[low] = arr[high];
		   arr[high] = temp;
		   
		   high--;low++;
		}
//print
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		
	}

	public static void main(String[] args) {
		int a[] = {5, 2, 4, 7, 9, 3, 1, 6, 8};
		halfSort(a);
		
	}
}
