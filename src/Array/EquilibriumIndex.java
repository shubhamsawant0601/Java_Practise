package Array;

public class EquilibriumIndex {
    public static void equilibrium(int a[]) {
    	int leftsum=0, rightsum=0;
    	int equilibrium = 0;
    	int index = a.length-1;
    	for (int i = 0; i < a.length; i++) {
			leftsum = leftsum + a[i];
			rightsum = rightsum + a[index];
			index--;
			
			if (leftsum == rightsum) {
				equilibrium = i+1;
				break;
			}
			
			if (i>index) {
				equilibrium = -1;
				break;
			}
		}
    	
    	System.out.println(equilibrium);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { -7, 1, 5, 2, -4, 3, 0 }; 
		equilibrium(arr);
		
		 int arr2[] = { 1,2,3,4,5,1,3,2,4 };
		 equilibrium(arr2);
		 
		 int arr3[] = {-7,1,5,2,-4,3,0};
		 equilibrium(arr3);
	}

}
