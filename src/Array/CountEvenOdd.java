package Array;

public class CountEvenOdd {
    public static void countEvenOdd(int[]a) {
    	int even=0;
    	int odd = 0;
    	for (int i = 0; i < a.length; i++) {
			if (a[i]%2==0) {
				even++;
			}else {
				odd++;
			}
		}
    	
    	System.out.println("Even :"+even+"\nOdd :"+odd);
    }
	public static void main(String[] args) {
        int a[] = {12,3,4,7,8,9,10,1};  
		countEvenOdd(a);
	}

}
