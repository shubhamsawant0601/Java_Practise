package Mathematics;

public class DivisibilityOfContigiousNumbers {
    
	public static void main(String[] args) {
       int a = 1215598;
       int n = a;
       int length = 0;
      //to find length of integer and array required 
       while(a>0) {
    	   a=a/10;
    	   length++;
       }
       
       int arr[] = new int [length];
       
       for (int i = arr.length-1; i >=0; i--) {
     		arr[i] = n%10;
	    	     n = n/10;
   	   }
    
       int num = 0;
       
       for (int i = 0; i < arr.length; i++) {
    	   num = 0;
		for (int j = i; j < arr.length; j++) {
			num = num*10+arr[j];
			if (num%11==0) {
				System.out.println(num);
			}
		}
	}     
	}
}
