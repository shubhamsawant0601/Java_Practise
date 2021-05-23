package Mathematics;
public class LeapYearorNot {
	
    public static void isLeap(int y) {
		if (y%4==0) {
			
			if (y%100==0 && y%400!=0) {
				System.out.println("Not Leap Year");	
			}else if (y%400==0) {
				System.out.println("Leap Year");
			}else {
				System.out.println("Leap Year");
			}	
		}else {
			System.out.println("Not Leap Year");
		}   	
    }
    
	public static void main(String[] args) {
        
		isLeap(2013);
		isLeap(1700);
		isLeap(2016);
	 
	}
}
