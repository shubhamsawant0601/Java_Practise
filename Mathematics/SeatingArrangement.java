package Mathematics;

public class SeatingArrangement {
	public static void permutations(int people, int seats) {
		int fact=1;
		
        
		while(seats>0) {
			fact = fact*people;
			people--;
			seats--;
			  
		}
		
		System.out.println("no. of ways to accupies seats "+fact);
	}

	public static void main(String[] args) {
	      	permutations(3,2);
	      	permutations(10,6);
	      	permutations(15,1);

	}
}
