package numbers;

public class PrimeNumbers {
	public static void PrimeNumbers(int x) {
	  boolean prime = false ;
	  
	  for (int i = 2; i < x; i++) {
			prime = true;
			int a = i;
		
			for (int j = 2; j <= a/2; j++) {
			    if (a%j == 0) {
			    	prime = false;
				    break;
			    }else {
				    prime = true;
			    }
	     	} 
		    
		if (prime) {
		  System.out.println(a);
		}
	}	
	}

	public static void main(String[] args) {
		int x = 100;
		PrimeNumbers(x);
	}
}
