package string;
import java.util.Scanner;
public class FindAsciiValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = 1;
		
		for (int i = 0; i < loop; i++) {
			loop++;
			char ch = sc.next().charAt(0);
			int ascii = (int) ch;
			System.out.println("Ascii Value of "+ch+" is "+ascii);
		}		
	}

}
