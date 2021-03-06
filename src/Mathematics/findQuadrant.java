package Numbers;

public class findQuadrant {
	public static void findQuadrant(int x , int y) {
		
		if (x!=0 && y!=0) {
					
			if(x<0) {
				if(y<0) {
					System.out.println("Third");
				}else {
					System.out.println("Second");
				}
			}else {
				if(y<0) {
					System.out.println("Fourth");
				}else {
					System.out.println("First");
				}
			}
		}

		
		if (x==0) {
			System.out.println("Y axis");
		}
		if (y==0) {
			System.out.println("X axis");
		}
	}

	public static void main(String[] args) {
		findQuadrant(1,1);
		findQuadrant(-1,1);
		findQuadrant(-1,-1);
		findQuadrant(1,-1);
		
		findQuadrant(1,0);
		findQuadrant(0,1);
	}

}
