package array;
public class TransposeMatrix {
	
	public static void PrintMatrix(int a[][]) {
		System.out.println("Matrix ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]+"  ");
			}System.out.println();
		    }	
	}
	
	public static int[][] Transpose(int a[][],int rows,int columns){
		int b[][] = new int[rows][columns]; 
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				b[j][i] = a[i][j];
			}
		    }
		return b;
	}

	public static void main(String[] args) {
		
		int a[][] = {{1,5,3},{8,7,6},{5,4,9}};
        
		PrintMatrix(a);
		
		int b[][] = Transpose(a,3,3);
		
		PrintMatrix(b);
		
		
		
	
		
		
	}
}
