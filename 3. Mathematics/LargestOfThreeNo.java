package Mathematics;

public class LargestOfThreeNo {
	
	public static int largestofThree(int a,int b,int c) {
		int largest1 = a>b?a:b;
	    int largest2 = largest1>c?largest1:c;	
		
		return largest2;
	}

	public static void main(String[] args) {
		int a = 25;
		int b = 45;
		int c = 85;
		System.out.println("Largest of three is "+largestofThree(a,b,c));

	}
}
