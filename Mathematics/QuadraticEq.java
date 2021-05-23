package Mathematics;

public class QuadraticEq {
    public static void solveQuadratic(double a, double b, double c) {
    	double x1 = (-b+(Math.sqrt((b*b)-4*a*c)))/(2*a);
    	double x2 = (-b-(Math.sqrt((b*b)-4*a*c)))/(2*a);
    	
    	System.out.println("roots are "+x1+" & "+x2);
    }
	public static void main(String[] args) {
         solveQuadratic(2,5,3);
         solveQuadratic(1,-3,0);
         solveQuadratic(0,5,-3);
         solveQuadratic(1,-3,1);
	}

}
