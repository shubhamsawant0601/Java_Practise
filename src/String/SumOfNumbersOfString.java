package Strings;

public class SumOfNumbersOfString {
    public static void sumOfNumbers(String s){
    	String temp = "0";
    	   int sum  = 0;
    	
    	for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
				temp = temp + c;
			}else {
				sum = sum + Integer.parseInt(temp);
				temp = "0";		
			}
		}
    	sum = sum + Integer.parseInt(temp);
    	
    	System.out.println(sum);
    }
	public static void main(String[] args) {
   		sumOfNumbers("1fg8j2h5h100");
	}
}
