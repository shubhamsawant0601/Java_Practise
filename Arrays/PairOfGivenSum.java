package Array;
import java.util.*;

public class PairOfGivenSum {
	public static void printPairsSet(int a[],int sum) {
		Set <Integer> t = new TreeSet<>();
		
		for(int i:a) {
			t.add(i);
		}
		
		for(Integer itr: t) {
		    int temp = sum-itr;
		    if(t.contains(temp)) {
		    	System.out.println(temp+" "+itr);
		    }
		}
	}
	
	public static void printPairs(int a[],int sum) {
		Arrays.sort(a);
		
		int l = 0;
		int r = a.length-1;
		while(l<r) {
			if(a[l]+a[r]==sum ) {
				System.out.println(a[l]+" "+a[r]);
				l++;
				r--;
			}
			else if(a[l]+a[r]<=sum){
				l++;
			}
			else {
				r--;
			}
		}
	}

	public static void main(String [] args) {
		int a[]= {1,5,3,6,4,7,9,8,2,1};
		int sum = 10;
        printPairs(a,sum);
        printPairsSet(a,sum);
	}

}
