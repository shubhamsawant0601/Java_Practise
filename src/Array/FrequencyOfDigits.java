package array;

public class FrequencyOfDigits {
	// find frequncy of digits and print no and frequancy accoring to ascending order of frequency 
	public static void FrequencyOfDigits(int a[]) {
		int fre[][] = new int [a.length][2];
		int x = -1;
		int y = -1;
//Finding Number of times each elemnt occured and register it in 2D array
		for (int i = 0; i < a.length; i++) {
		    int visited = -1; 
		    int count   = 1;
		    
		    if (a[i]!=visited ) {
		    	x++;
		    	y = 0;
		    	fre[x][y] = a[i];
				
			  for (int j = i+1; j < fre.length; j++) {
				   if (a[j]==a[i]) {
					   a[j] = visited;
					   count++;
				   }
				   }
			  y++;
		      fre[x][y] =  count;
				   
		    }				
		}

//sorting according to second sub element of every element in 2D array	 
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
		
			for (int i = 0; i < fre.length-1; i++) {
				if (fre[i][1]<fre[i+1][1]) {
					int temp = fre[i][1];
					fre[i][1] = fre[i+1][1];
					fre[i+1][1] = temp;
					
					    temp = fre[i][0];
					fre[i][0] = fre[i+1][0];
					fre[i+1][0] = temp;
					
					
					sorted = false;
				}
			}
		}
		
// Print elements of 2D array
		System.out.println("-------------------");
		System.out.println("Number | Frequency");
		System.out.println("-------------------");
		for (int i = 0; i < fre.length; i++) {
				if (fre[i][0]!=0) {	
				System.out.print(fre[i][0]+"      |  "+fre[i][1]);
			    System.out.println();
		}
		}
		System.out.println("-------------------");
			
	}

	public static void main(String[] args) {
	   int a[] = {8,1,9,2,1,1,6,9,4,6,7,7,6,4,3,2,4,5,6};
	   FrequencyOfDigits(a);
	}

}
