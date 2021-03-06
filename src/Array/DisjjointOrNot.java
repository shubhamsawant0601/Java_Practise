package Array;

public class DisjjointOrNot {
    public static void isDisjoint(int a[],int a1[]) {
    	boolean disjoint = true;
    	for (int i = 0; i < a.length; i++) {
    		int element = a[i];
			for (int j = 0; j < a1.length; j++) {
				if (a1[j]==element) {
					disjoint = false;
					break;
				}
			}
		}
    	if (disjoint) {
			System.out.println("Disjoint");
		}else {
			System.out.println("Not Disjoiont");
		}
    }
	public static void main(String[] args) {
         int a[] = {1,2,3,4,5};
         int a1[] = {6,7,8,9,0,5};
         
         isDisjoint(a,a1);
	}

}
