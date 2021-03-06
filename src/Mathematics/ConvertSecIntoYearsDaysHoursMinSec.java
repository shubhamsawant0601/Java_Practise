package numbers;

public class ConvertSecIntoYearsDaysHoursMinSec {
	public static void convert(int sec) {
		int years = sec/(365*24*60*60);
		      sec = sec%(365*24*60*60);
		int days  = sec/(24*60*60); 
		      sec = sec%(24*60*60);
		int hours = sec/(60*60);
		      sec = sec%(60*60);
		int min   = sec/(60);
	  int seconds = sec%60;
		  
		  System.out.println("years   =   " +years);
		  System.out.println("days    =   " +days);
		  System.out.println("hours   =   " +hours);
		  System.out.println("minutes =   " +min);
		  System.out.println("seconds =   " +seconds);
	}
	public static void main(String[] args) {
		
		int seconds = 3456789*60;
		convert(seconds);

	}

}
