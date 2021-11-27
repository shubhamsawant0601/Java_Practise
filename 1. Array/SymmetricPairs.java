package Arrays;

public class SymmetricPairs {
     public static void printSymmetricPairs(int a[][]) {
    	 boolean visited [] = new boolean[a.length];
    	 for (int i = 0; i < a.length; i++) {
			int x = a[i][0];
			int y = a[i][1];
    		for (int j = i+1; j < a.length; j++) {
    			int n = a[j][0];
    			int m = a[j][1];
    			if (visited[i]==true) {
					continue;
				}
				if ((x==m && y==n)) {
					visited[j]=true;
					System.out.println("{"+x+","+y+"} & {"+n+","+m+"}");
				}
			} 
		}
     }
     
     public static void main (String []args) {
    	int a [][] = {{1,2},{3,4},{5,6},{2,1},{4,3},{1,2}};
    	 printSymmetricPairs(a);
     }
}
