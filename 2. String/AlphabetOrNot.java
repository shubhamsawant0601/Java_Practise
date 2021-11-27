package String;

public class AlphabetOrNot {
    public static void isAlphabet(char a) {
    	int assci = a;
    	if ((assci>=65 && assci<=90) || (assci>=97 && assci<=122)) {
			System.out.println(a+" is alphabet");
		}else {
			System.out.println(a+" is not alphabet");
		}
    }
	public static void main(String[] args) {
		isAlphabet('a');
		isAlphabet('z');
		isAlphabet('A');
		isAlphabet('Z');
		isAlphabet('s');
		isAlphabet('e');
		isAlphabet('f');
		isAlphabet('v');
		isAlphabet('u');
		isAlphabet('b');
		isAlphabet('n');
		isAlphabet('q');
		isAlphabet('g');
		isAlphabet('n');
		System.out.println();
		isAlphabet('!');
		isAlphabet('#');
		isAlphabet('%');
		isAlphabet('^');
		isAlphabet('&');
		isAlphabet('*');
		isAlphabet('(');
		isAlphabet('>');
		isAlphabet('?');
		isAlphabet('}');
	}

}
