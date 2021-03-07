package Array;
public class RepeatingElements {
	
	public static void repeatingElements(int a[]) {
     boolean visited [] = new boolean[a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					visited[j]=true;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (visited[i]!=false) {
				System.out.println(a[i]);
			}
		}
	}
	public static void nonrepeatingElements(int a[]) {
	     boolean visited [] = new boolean[a.length];
			for (int i = 0; i < a.length; i++) {			
				for (int j = i+1; j < a.length; j++) {
					if (a[i]==a[j]) {
						visited[j]=true;
					}
				}
			}
			for (int i = 0; i < a.length; i++) {
				if (visited[i]!=true) {
					System.out.println(a[i]);
			}
		}
	}
	public static void main(String[] args) {
        int a[] = {1,9,2,3,4,5,6,7,8,9,1};
		repeatingElements(a);
		System.out.println();
		nonrepeatingElements(a);

	}
}
