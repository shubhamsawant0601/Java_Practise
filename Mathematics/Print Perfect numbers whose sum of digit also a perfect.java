/*Input: arr[] = { 3, 8, 12, 28, 6 }
Output: 6
Explanation: The array element arr[4] (= 6) is a perfect number. The array element arr[3] (= 28) is a perfect number but its sum of digits (= 10) is not a perfect number.

Input: arr[] = { 1, 2, 3 }
Output: 1*/
package Mathematics;

public class CountPerfectNumbrsWhoseSumofDigitisPerfect {
	
  // function to iterate array and find if number and its sum of digit is perfect
	public static void countPerfectwithSumPerfect(int[]arr) {
		
		for(int i=0; i<arr.length;i++) {
			if(isPerfect(arr[i]) && isPerfect(sumOfDigits(arr[i]))) {
				System.out.println(arr[i]);
			}
		}
	}
	
  
  // function to find perfect number
	public static boolean isPerfect(int n) {
		int sum = 0;
		
		for(int i=1; i<=n/2+1; i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		
		if(sum==n) {
			return true;
		}else {
			return false;
		}
	}
	

  // function to find sum of digits
	public static int sumOfDigits(int n) {
		int sum = 0;
		while(n>0) {
			sum += n%10;
			n = n/10;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		int a[] = { 3, 8, 12, 28, 496,6,1,2 };
		countPerfectwithSumPerfect(a);      
	}
}
