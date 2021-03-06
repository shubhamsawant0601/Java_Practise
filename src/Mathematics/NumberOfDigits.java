package Numbers;

public class NumberOfDigits {
    public static void noOfDigits(int a ) {
    	int count = 0;
    	int a2 = a;
    	while(a>0) {
    		a = a/10;
    		count++;
    	}
    	
    	System.out.println("Number of digits in "+a2+" are "+count);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         noOfDigits(123);
         noOfDigits(1234);
         noOfDigits(12300);
         noOfDigits(123456);
         noOfDigits(1202243);
	}

}
