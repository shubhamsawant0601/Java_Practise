package Mathematics;
public class ArmstrongInRange {
	public static void armstrongIn(int x,int y) {
		for (int i = x; i <=y ; i++) {
			 int n = i;
			 int sum=0,a=0;
			 while(n>0) {
				   a = n%10;
				 sum = sum+(a*a*a);
				   n = n/10; 
			 }
			 if (sum==i) {
				System.out.println(i+",");
			}
		}
	}

	public static void main(String[] args) {
		armstrongIn(1,500);

	}
}
