package Numbers;
public class PositiveNegative {
	
	   public static void isPositiveOrNegative(int n) {
		   if(n<0) {
				System.out.println("Negative Number");
			}else if(n==0) {
				System.out.println("Zero");
			}else {
				System.out.println("Positive Number");
			}
	   }
	
	public static void main(String[] args) {
		isPositiveOrNegative(-45);
		isPositiveOrNegative(0);
		isPositiveOrNegative(12);
		isPositiveOrNegative(4);
		isPositiveOrNegative(-5);
           
	}
}
