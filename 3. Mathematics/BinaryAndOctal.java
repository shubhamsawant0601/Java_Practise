package Mathematics;

public class BinaryAndOctal {
    public static void toOctal(int n) {
    	int sum = 0;
    	int a;
    	int m = n;
    	int binary = 1;
    	int arr[] = new int [15];
    	int i = 0;
    	while(n>0) {
    		a = n%10;
    		sum = sum + a*binary;
    		binary = binary*2;
    		n = n/10;
    	}
    	
    	
    	while(sum>0) {
    		arr[i++] = sum%8;
    		sum = sum/8;
    	}
    	
        System.out.print(m+" to octal is ");
        for (int j = i-1; j >=0; j--) {
			System.out.print(arr[j]);
		}
    	
    }
    
    public static void toBinary(int n) {
    	 int binary[] = new int[40];
    	 int i = 0;
    	 int a;
    	 int sum = 0;
    	 int octal = 1; 
    	 int m = n;
    
    	 while(n>0) {
    		 a = n%10;
    		 sum = sum + a*octal;
    		 octal = octal*8;
    		 n = n/10;
    	 }
    	 
    	 int decimal = sum;	 
    	 System.out.println("Decimal is "+decimal);
        
    	 while(decimal>0) {
    		 binary[i++] = decimal%2;
    		 decimal= decimal/2;
    	 }
    	 
    	 System.out.print(m+" to Binary is ");
    	 for (int j = i-1; j >=0; j--) {
			System.out.print(binary[j]);
		}
    }
	public static void main(String[] args) {
		toOctal(101010);
		System.out.println();
		toBinary(52);

	}

}
