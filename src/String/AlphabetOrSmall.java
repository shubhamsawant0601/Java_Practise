package string;
import java.util.Scanner;
public class AlphabetOrSmall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = 1;
		
	for (int i = 0; i < loop; i++) {
		char s = sc.next().charAt(0);
		loop++;
		
		if (s>=65 && s<=90) {
			System.out.println("it is capital");
		}else if (s>=97 && s<=122) {
			System.out.println("it is small ");
		}else {
			System.out.println("not an alphabet");
		}
	}
}
}
