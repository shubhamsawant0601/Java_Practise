package Arrays;

public class SortByReferenceOfAnotherArray {
    public static void sortByReference(int a[],int a1[]) {
    	int index = 0;
    	for (int i = 0; i < a1.length; i++) {
			
    		for (int j = 0; j < a.length; j++) {
				if (a1[i]==a[j]) {
					int temp = a[index];
					a[index] = a[j];
					a[j] = temp;
					index++;
				}
			}
		}
    	
    	for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"  ");
		}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 2, 3, 4, 3, 2, 4, 2, 5};
        int a1[] = {4, 2, 1, 3};
        
        sortByReference(a,a1);
        System.out.println();
        int ar[] =  {3, 6, 13, 3, 9, 10, 14, 6, 9, 13};
        int ar1[] = {6, 3, 9, 13, 10};
        
        sortByReference(ar,ar1);
	}

}
