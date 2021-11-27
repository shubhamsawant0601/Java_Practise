package Mathematics;

public class WriteNumbersRecursively {
	public static void numbers(int a,int b) {
		int n = a;
		if (n==b+1) {
			return;
		}
		
		System.out.println(a);
		numbers(a+1,b);
	}

    public static void main(String[] args) {
		
		 numbers(1,100);
	}
}
