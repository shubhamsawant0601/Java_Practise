package numbers;
import java.util.Scanner;

public class LCDandGCD {
	//Lowest common multiple
	public static void LCM(int a,int b) {
		int m = a>b?a:b;
		int LCM = m;
		
		for (int i = m; i <= a*b; i++) {
			if (i%a==0 && i%b==0) {
				LCM = i;
				break ;
			}
		   }
		System.out.println("LCM "+LCM);
	}
	
	//Greatest common divisor
	public static void GCD(int a,int b) {
		int m = a>b?b:a;
		int GCD = 1;
		
		for (int i = m; i > 0; i--) {
			if (a%i==0 && b%i==0) {
				GCD = i;
				break;
			}
		   }
		System.out.println("GCD "+GCD);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = 1;
		for (int i = 0; i < loop; i++) {
			loop++;
			System.out.println("Enter no.");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
	        LCM(a,b);
	        GCD(a,b);
		}
		

	}

}
