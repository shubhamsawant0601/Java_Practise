package Mathematics;

public class SmallestNumberWhoseDigitMultiplytoGiveGivenNumber {
	
	public static int smallestDigitMultiplier(int n) {
		int m = 0;
		int ans = 0;
		int temp = 0;
		
		if(n<10 && n>=0) {
			return n;
		}
	// to find the digits and form number
    // in reverse order whose digits multiply to give number
	// we start from 9 because we want to find min number hence most significant digit should be on right
		for(int i=9;i>1;i--) {
			
			while(n%i==0) {
				m = m*10+i;
				n = n/i;
			}
		}
	// if no number divides the given number completely
		if(n>1) {
			return -1;
		}
		
	// to reverse the number 
		while(m>0) {
		    temp = m%10;
			ans = ans*10 + temp;
			m = m/10;
		}
		return ans;
	}

	public static void main(String[] args) {
        System.out.println(smallestDigitMultiplier(100));
        System.out.println(smallestDigitMultiplier(10));
        System.out.println(smallestDigitMultiplier(15));
        System.out.println(smallestDigitMultiplier(20));
        System.out.println(smallestDigitMultiplier(1));
        System.out.println(smallestDigitMultiplier(0));
        System.out.println(smallestDigitMultiplier(25));
        System.out.println(smallestDigitMultiplier(30));
        System.out.println(smallestDigitMultiplier(26));
	}
}
