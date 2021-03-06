package Numbers;
public class ReplaceDigit {
	
	public static void replaceDigit(int d,int r, int n) {
		int a = 1;
		int sum = 0;
		while(n>0) {
			a = n%10;
			if (a==d) {
				sum = sum*10 + r;
				n = n/10;
				continue;
			}
			sum = sum*10 + a;
			n = n/10;
		}
		
		int num = sum;
		    sum = 0;
		
		while (num>0) {
			a = num%10;
			sum = sum*10 + a;
			num = num/10;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		replaceDigit(0,1,1200);
		replaceDigit(0,1,51004040);
		replaceDigit(5,4,55544);
		replaceDigit(3,1,1234);
		replaceDigit(5,2,456);
		replaceDigit(9,5,999);

	}
}
