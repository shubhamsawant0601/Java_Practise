package Array;

public class ReplaceElementByRank {
	public static void replaceElementsByRank(int a[]) {
		boolean sorted = false;
		int arr[] = new int [a.length];
		for (int i = 0; i < a.length; i++) {
			arr[i]=a[i];
		}
		while(sorted==false) {
			sorted = true;
			for (int i = 0; i < a.length-1; i++) {
				if (a[i]>a[i+1]) {
					int temp = a[i];
					    a[i] = a[i+1];
					   a[i+1]= temp;
					   sorted = false;
				}
			}
		}
				
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (arr[i]==a[j]) {
					arr[i]=j+1;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
	}
	public static void main(String[] args) {
		int a [] = {10,8,15,12,6,20,1};
		replaceElementsByRank(a);
	}

}
