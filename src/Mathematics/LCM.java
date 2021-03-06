package Numbers;

public class LCM {
	public static void lcm(int a,int b) {
		int max = a>b?a:b;
		int pro = a*b;
		int lcm = max;
		for (int i = max ; i <= pro; i++) {
			if (i%a==0 && i%b==0) {
				lcm = i;
				break;
			}
		}
		
		System.out.println("LCM of "+a+" & "+b+" is "+lcm);
	}

	public static void main(String[] args) {
		lcm(3,5);
		lcm(5,8);
		lcm(20,40);
		lcm(25,50);
		lcm(30,40);
		lcm(75,80);
		lcm(24,12);
		lcm(56,28);
		lcm(50,5);
		lcm(10,12);

	}

}
