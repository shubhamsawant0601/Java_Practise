package Mathematics;

public class NoOfDaysInMonth {
	public static void noOfDaysIn(int month, int year) {
		if (month>=1  && month<=12 && month!=2) {
			if (month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
				System.out.println("no. of days = 31");
			}else {
				System.out.println("no. of days = 30");
			}
		}else if(month==2){
			if (year%4==0 && year%100!=0) {
				System.out.println("no. of days = 29");
			}else if(year%400==0) {
				System.out.println("no. of days = 29");
			}else if(year%100==0 && year%400!=0) {
				System.out.println("no. of days = 28");
			}else {
				System.out.println("no. of days = 28");
			}
		}
	}

	public static void main(String[] args) {
		noOfDaysIn(1,2000);
		noOfDaysIn(2,2020);
		noOfDaysIn(2,2019);
		noOfDaysIn(2,2000);
		noOfDaysIn(2,1700);
		noOfDaysIn(9,1756);
		noOfDaysIn(8,1452);
		noOfDaysIn(7,2015);
		noOfDaysIn(5,2145);
		noOfDaysIn(2,1780);
		noOfDaysIn(7,2012);
		noOfDaysIn(8,2017);
		noOfDaysIn(12,2022);
		noOfDaysIn(1,2000);

	}

}
