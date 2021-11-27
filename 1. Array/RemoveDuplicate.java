package Array;

public class RemoveDuplicate {

	public static void main(String[] args) {
	  int a[] = {1,8,36,7,1,8,36,36,85,36,85};
	  int x,y,s,l=a.length-1;
	  
	  for (int i = 0; i < a.length; i++) {
		 
		  for (int j = i+1; j < a.length; j++) {
			
			  if (a[i]==a[j]) {
				s=j;
				while (s<a.length-1) {
					a[s]=a[s+1];
					s++;
				}
				// l--;
			     //a[l]=0;
			    
			}
		}
	}

	  
	  for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	  }
	  
	}

}
