package Mathematics;
public class GreatestofThree {

	public static void greaterOfThree(int x, int y, int z) {

		int m1=0, m2=0;
		
	    m1 = x>y?x:y;
		
	    m2 = m1>z?m1:z;
	    
	    System.out.println("Greatest of three "+m2);
	}
	
	public static void main(String[] args) {
	
		greaterOfThree(10,12,15);
		greaterOfThree(17,1,14);
		greaterOfThree(0,2,0);
		greaterOfThree(8,57,57);
	
	}
}


