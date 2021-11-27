/*Input: N = 11
Output: 29
Explanation: The sum of the digits = 2 + 9 = 11 ( = N).

Input: N = 46
Output: -1*/
package Mathematics;

public class SmallestNumberbySumOfDigitsofNonRepeatingNumber {
	public static int smallestNumber(int n) {
		
		//if n > 45 it cannot be formed by sum of single digits with non repeating condition
		if(n>45) {
			return -1;
		}
		int digit = 9;
		String res = "";
		
	   //form sum of digit from 9 to 1 in reverse and check if it equals to n
		while(n>digit) {
		    res = (char)('0'+digit)+ res;
		    n = n - digit;
		    digit--;
		}
		//if n is having some reminder
		if(n>0) {
			res = (char)('0'+n) + res;
		}
		
		return Integer.parseInt(res);
	}

	public static void main(String[] args) {
        System.out.println(smallestNumber(11));
        System.out.println(smallestNumber(46));
        
        System.out.println(smallestNumber(44));
        System.out.println(smallestNumber(30));
        
        System.out.println(smallestNumber(27));
	}
}
