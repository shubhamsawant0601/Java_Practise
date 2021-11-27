package Mathematics;
public class GreatestofTwo {

	public static void greaterOfTwo(int n,int m) {
		if (n!=m) {
			  int max = n>m?n:m;
			  System.out.println("Greater is "+max);
		}else {
			System.out.println("Numbers are equal");
		}
	}
	
	public static void main(String[] args) {
	 
		greaterOfTwo(15,10);
		greaterOfTwo(25,78);
		greaterOfTwo(11,11);
		greaterOfTwo(14,75);
		greaterOfTwo(15,-15);

	}
}
