package String;

public class RemoveVowels {
	public static void removeVowels(String s){
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c=='a'||c=='e'||c=='u'||c=='i'||c=='o'||
			    c=='A'||c=='E'||c=='U'||c=='I'||c=='O') {
				continue;
			}else {
				s1 = s1 + c;
			}
		}
		System.out.println(s1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         removeVowels("My Name Is Shubham Sawant ");
	}
}
