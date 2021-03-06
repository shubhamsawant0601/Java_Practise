package Array;

public class Subset {
    public static void isSubset(int a[],int a1[]) {
    	boolean subset = false;
    	boolean found  = false;
    	for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a1.length; j++) {
				if(a1[i]==a[j]) {
					found = true;
					break;
				}else {
					found = false;
				}
			}
			if (found) {
				subset=true;
			}else {
				subset = false;
				break;
			}
		}
    	
    	if (subset) {
			System.out.println("Subset");
		}else {
			System.out.println("Not Subset");
		}
    }
	public static void main(String[] args) {
		int a[] = {6,7,8,1};
        int a1[] = {6,7,8,1,9,0,5};
        
        isSubset(a1,a);

	}

}
