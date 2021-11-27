package Mathematics;
public class EvenOdd {
	public static void evenOrOdd(int n) {
		
       if (n%2==0) {
    	   System.out.println(n+" is Even");
	   }else {
           System.out.println(n+" is Odd");
	   }
	}

	public static void main(String[] args) {
         
		evenOrOdd(54);
		evenOrOdd(5);
		evenOrOdd(84);
		evenOrOdd(70);
		evenOrOdd(7);

	}
	
}
