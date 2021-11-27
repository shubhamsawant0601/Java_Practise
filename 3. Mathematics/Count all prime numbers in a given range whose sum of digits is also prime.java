/*Input: L = 1, R = 10 
Output: 4 
Explanation: 
Prime numbers in the range L = 1 to R = 10 are {2, 3, 5, 7}. 
Their sum of digits is {2, 3, 5, 7}. 
Since all the numbers are prime, hence the answer to the query is 4.

Input: L = 5, R = 20 
Output: 3 
Explanation: 
Prime numbers in the range L = 5 to R = 20 are {5, 7, 11, 13, 17, 19}.1 
Their sum of digits is {5, 7, 2, 4, 8, 10}. 
Only {5, 7, 2} are prime, hence the answer to the query is 3.*/
package Mathematics;

import java.util.Arrays;

public class CountPrimeNumberWhoseSumofDigitalsoPrime {
    public static int countPrime(int a,int b) {
    	
    	// Sieve of Eratosthenes
    	int count = 0;
    	int max = 1000000;
    	boolean arr[] = new boolean[max+1];
    	
    	Arrays.fill(arr, true);
    	
    	arr[0] = false;
    	arr[1] = false;
    	
    	for(int i=2;i*i<=max;i++) {
    		if(arr[i]) {
    	        for(int j=i*i;j<=max;j+=i) {
    	    	    arr[j] = false;
    	        }
    	    }
        }	
    	// count number who is prime and whose sum of digit is prime
    	for(int i=a; i<=b; i++) {
    		if(arr[i] && arr[sumOfDigit(i)]) {
    			count++;
    		}
    	}	
    	return count;
    }
    
    // function to find sum of digis
    
    public static int sumOfDigit(int a) {
    	int sum = 0;
    	while(a>0) {
    		sum = sum + a%10;
    		a = a/10;
    	}
    	return sum;
    }
	
    public static void main(String[] args) {
    	
         System.out.print(countPrime(5,20));
	}
}
