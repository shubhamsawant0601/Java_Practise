package String;

public class CountVowel {
	
	public static void countVowels(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c=='a'||c=='e'||c=='u'||c=='i'||c=='o'||
			    c=='A'||c=='E'||c=='U'||c=='I'||c=='O') {
				count++;
			}
		}
		
		System.out.println("no. of vowels "+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         countVowels("shubham");
	}
}
