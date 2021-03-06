package Strings;

public class VowelOrConsonant {
    public static void isVowelOrConsonant(char a) {
    	if (a=='a'||a=='e'||a=='i'||a=='o'||a=='u'
    			||a=='A'||a=='E'||a=='I'||a=='O'||a=='U') {
			System.out.println(a+" is a vowel");
		}else {
			System.out.println(a+" is a consonant");
		}
    }
	public static void main(String[] args) {
		isVowelOrConsonant('A');
		isVowelOrConsonant('E');
		isVowelOrConsonant('I');
		isVowelOrConsonant('O');
		isVowelOrConsonant('U');
		isVowelOrConsonant('a');
		isVowelOrConsonant('e');
		isVowelOrConsonant('i');
		isVowelOrConsonant('o');
		isVowelOrConsonant('u');
		
		System.out.println();
		
		isVowelOrConsonant('s');
		isVowelOrConsonant('c');
		isVowelOrConsonant('t');
		isVowelOrConsonant('v');
		isVowelOrConsonant('Q');
		isVowelOrConsonant('R');
		isVowelOrConsonant('N');
		isVowelOrConsonant('D');
		
	}

}
