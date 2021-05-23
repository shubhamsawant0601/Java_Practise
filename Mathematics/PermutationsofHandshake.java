package Mathematics;

public class PermutationsofHandshake {
	public static void noOfHandShakes(int people) {
		int n = people;
		int HandShake = (n*n-n)/2;
		System.out.println("no. handshakes between "+people+" are "+HandShake);
	}

	public static void main(String[] args) {
		noOfHandShakes(5);
		noOfHandShakes(30);
		noOfHandShakes(21);
		noOfHandShakes(31);

	}
}
