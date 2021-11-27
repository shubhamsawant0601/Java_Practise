package Mathematics;

public class BinaryToDecimal {
	public static void toDecimal(int n) {
		int a = 1;
		int b = 1;
		int m = n;
		int sum = 0;
		while(n>0) {
			a = n%10;
			sum = sum + a*b;
			b = b*2;
			n = n/10;
		}
		System.out.println(m+" to decimal is "+sum);
	}
	
	public static void toBinary(int a) {
	     int arr[] = new int[10];
	     int i = 0;
	     int b = a;
	     while(a>0) {
	    	 arr[i] = a%2;
	    	 a = a/2;
	    	 i++;
	     }
	     System.out.print(b+" to "+" binary is ");
	     for (int j = i-1; j >=0; j--) {
			System.out.print(arr[j]);
		}
	    System.out.println();
	}

	public static void main(String[] args) {
		toDecimal(01);
		toDecimal(10);
		toDecimal(11);
		toDecimal(100);
		toDecimal(101);
		toDecimal(110);
		toDecimal(111);
		toDecimal(111001);
		
		toBinary(1);
		toBinary(2);
		toBinary(3);
		toBinary(4);
		toBinary(5);
		toBinary(6);
		toBinary(7);
		toBinary(8);
		toBinary(57);
		

	}

}
