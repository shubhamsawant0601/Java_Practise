package String;
import java.util.*;
public class RemoveSpecificCharandReturnLowerCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String ans = "";
		char ch[] = s.toLowerCase().toCharArray();
		
		for (int i = 0; i < ch.length-1; i++) {
			if(ch[i]=='8') {
				continue;
			}else if(ch[i]=='5' && ch[i+1]=='6') {
				i = i+1;
			}else {
				ans += String.valueOf(ch[i]);
			}
		}
	    if(s.charAt(s.length()-1)!=8) {
	    	ans += String.valueOf(ch[s.length()-1]);
	    }
       System.out.println(ans);
	}

}
