package Mathematics;

public class CountOccuranceofDigitInNumber {
    public static void countOccuranceOf(int r,int n) {
    	int count = 0;
    	int number = n;
    	int a ;
    	while (n>0) {
			a = n%10;
			if (a==r) {
				count++;
			}
			n = n/10;
		}
    	
    	System.out.println("frequency of "+r+" in "+number+" is "+count);
    	
    }
	public static void main(String[] args) {
		countOccuranceOf(8,288);
		countOccuranceOf(1,25463175);
		countOccuranceOf(5,68596);
		countOccuranceOf(6,25366226);
		countOccuranceOf(7,2371717);
		countOccuranceOf(9,90000);
		
	}

}
