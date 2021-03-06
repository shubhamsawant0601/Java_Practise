package Numbers;

public class PossibleDecoding {
	public static void possibleDecoding(int a) {
		int l=0; 
		int number = a;
		int number2 = a;
		while(a>0) {
			a=a/10;
			l++;
		}
		int arr [] = new int[l];
		
		for (int i = arr.length-1; i >= 0; i--) {
			arr[i] = number%10;
			number = number/10;
		}
		int count = 1;
		for (int i = 0; i < arr.length-1; i++) {
			if (
		}
		
		System.out.println("number of decoding of the sequence "+number2+" are "+count);
	}

	public static void main(String[] args) {
		possibleDecoding(121);
		possibleDecoding(141);
	}

}
