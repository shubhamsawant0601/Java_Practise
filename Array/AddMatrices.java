package Array;

public class AddMatrices {
	public static void addMatrices (int a[][],int b[][]) {
		int c[][] =new int [3][3];
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				c[i][j] = a[i][j]+b[i][j];
			}
		}
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				System.out.print(c[i][j]+"    ");
			}
			System.out.println("\n");
		}
	}

	public static void main(String[] args) {
		int a[][] = {{6,2,1},{5,1,1},{11,1,7}};
		int b[][] = {{8,5,1},{8,1,8},{1,10,8}};
 
		addMatrices(a,b);
	}
}
