package Array;

public class DistinctElements {
    public static void distinctOf(int a[]) {
    	boolean visited [] = new boolean[a.length];
        int count = 0;
    	for (int i = 0; i < a.length; i++) {
    		if (visited[i]==false) {
				System.out.println(a[i]+",");
			}
			
    		for (int j = i+1; j < a.length; j++) {
				 if (a[i]==a[j]) {
					visited[j]=true;
				}
			}
		}
    }
	public static void main(String[] args) {
           int a[]= {1,2,1,2,3,4,5,6,7,8,9,1,};
           distinctOf(a);
	}

}
