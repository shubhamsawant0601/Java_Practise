package Array;
public class ReverseArray {
    
	public static int [] reverse(int a[]) {
    	int rev[] = new int [a.length];
    	int index = a.length-1;
    	for (int i = 0; i < rev.length; i++) {
			rev[i] = a[index--];
		}
    	
    	return rev;
    }
	
	public static void main(String[] args) {
		int a[] = {12,2,3,25,14,58,52};
		
		int b []=reverse(a);
       
		System.out.print("[");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+"  ");
		}
		System.out.print("]");
	}
}
