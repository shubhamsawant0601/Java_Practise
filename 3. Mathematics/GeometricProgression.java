package Mathematics;

public class GeometricProgression {
	public static void sum(double a,double r,double n) {
		double sum = a;
		
		for (int i = 1; i <= n; i++) {  
			sum  = sum + a*getPower(r,i);
		   }	
		sum = Math.round(sum*100.0)/100.0;
		System.out.println("Sum is "+sum);
	}
	
	public static double getPower(double no,double power) {
		if (power==1) {
			return no;
		}
		return no*getPower(no,power-1);
	}

	public static void main(String[] args) {
		double a = 1.125;
		double r = 2;
		double n = 4;
		
		sum(a,r,n);

	}
}
