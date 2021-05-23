package SortingAlgorithms;

public class BubbleSort {

public static void bubbleSort(int[] a) {
    boolean sorted = false;
    int temp;
    while(!sorted) {
        sorted = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i+1]) {
                temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
                sorted = false;
            }
        }
    }
}
public static void main(String[] args) {
	int a[] = {5,2,9,7,8,6,4,3};
	bubbleSort(a);
	
	for (int i= 0;  i< a.length; i++) {
		System.out.println(a[i]);
	}
	
}
}