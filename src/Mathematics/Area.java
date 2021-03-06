package Numbers;

public class Area {
	public static void areaOfCircle(int r) {
		double area = Math.PI*r*r;
		       area = Math.round((area*100))/100D;
		System.out.println("Area of circle with radius "+r+" is "+area);
	}
	
	public static void areaOfSquare(int a) {
		double area = a*a;
		System.out.println("Area of square with side "+a+" is "+area);
	}
	public static void areaOfRectangle(int a,int b) {
		double area = Math.round(a*b);
		System.out.println("Area of rectangle with sides "+a+" & "+b+" is "+area);
	}
	public static void areaOfTriangle(int h,int b) {
		double area = 0.5*h*b;
		System.out.println("Area of triangle with hight and base "+h+" & "+b+" is "+area);
	}

	public static void main(String[] args) {
                  areaOfCircle(25);
                  areaOfSquare(25);
                  areaOfRectangle(25,30);
                  areaOfTriangle(10,20);
	}
}
