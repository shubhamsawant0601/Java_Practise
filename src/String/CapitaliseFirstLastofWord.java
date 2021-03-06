package Strings;

public class CapitaliseFirstLastofWord {
	
	public static void CapitalizeFirstLAstOfWord(String string) {
		String []str = string.split("\\s");
		for (int i = 0; i < str.length; i++) {	
			String s = str[i];
			str[i] = str[i].replace(s.charAt(0), Character.toUpperCase(s.charAt(0)));
			str[i] = str[i].replace(s.charAt(s.length()-1), Character.toUpperCase(s.charAt(s.length()-1)));
		}
		
		String newS = "";
		for (int i = 0; i < str.length; i++) {
			newS = newS + str[i]+" ";
		}
		
		System.out.println(newS);
	}

	public static void main(String[] args) {
		CapitalizeFirstLAstOfWord("abc xyz pqr djfhfgbfg");
	}
}
