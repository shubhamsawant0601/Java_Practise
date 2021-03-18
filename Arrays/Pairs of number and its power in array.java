package Array;

public class PairsOfNumberandItsPower {
	
  public static boolean isPower(int x,int y) {
		int max = x>y?x:y;
		
		while(x>0 && x%y==0){
			x/=y;			
		}
		
		if(x==1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void pairsOfPower(int a[]){
		
		for(int i=0;i<a.length-1;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				if(i==j) {
					continue;
				}
				
				if(isPower(a[i],a[j])||isPower(a[j],a[i])) {
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		int a[] = { 16, 2, 3, 9,100,10,625,5,25,68,35,49,25,7 };
		int arr[] = {2, 3, 5, 7};
		
		pairsOfPower(a);
		pairsOfPower(arr);
 }
}
