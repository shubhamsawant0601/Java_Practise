package Numbers;

public class AutomorphicNumber {
    public static void isAutomorphic(int a) {
    	int square = a*a;
    	int num    = a ;
    	int x = 1;
    	while(a>0) {
    		a=a/10;
    		x = x*10;
    	}
    	int n = square-num;
    	if(n%x==0) {
    		System.out.println("Automorphic");
    	}else {
    		System.out.println("Not Automorphic");
    	}
    }
    
	public static void main(String[] args) {
		isAutomorphic(6);
		isAutomorphic(5);
		isAutomorphic(25);
		isAutomorphic(376);
		isAutomorphic(76);
		isAutomorphic(2);
		isAutomorphic(3);
		isAutomorphic(4);
		isAutomorphic(7);
		isAutomorphic(9);
		isAutomorphic(10);
		isAutomorphic(100);
	}

}
