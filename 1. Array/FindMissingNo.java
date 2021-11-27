package Array;
import java.util.Scanner;

public class FindMissingNo {

	public static void main(String[] args) {
		int[]a = {1,2,3,4,5,6,7,8,9,10,11,13,14,15,16,17,18,19,20,22,23,24,25,26,27,28,29,30,32};
		
		System.out.println("Missing numberss are");
		for (int i = 1; i < a.length; i++) {
			if (a[i]!=(a[i-1]+1)) {
				System.out.println(a[i-1]+1);
			}
		}

	  }

}
