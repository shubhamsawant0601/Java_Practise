package Strings;

import java.util.Arrays;

public class Anagram {
    public static void isAnagram(String s, String s1) {
    	boolean anagram = false;
        String str = s.toLowerCase();
        String str1 = s1.toLowerCase();
    	char c [] = str.toCharArray();
    	char c1 [] = str1.toCharArray();
    	
    	Arrays.sort(c);
    	Arrays.sort(c1);
    	
    if (c.length==c1.length) {
			
    	for (int i = 0; i < c1.length; i++) {
			if (c[i]==c1[i]) {
				anagram = true;
			}else {
				anagram = false;
				break;
			}
		}
    }
    	if (anagram) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Angram");
		}
 }
   
	public static void main(String[] args) {
           isAnagram("PrepInsta","InstaPrep");
           isAnagram("elbow","below");
           isAnagram("cat","tac");
           isAnagram("arc","car");
           isAnagram("night","thing");
           isAnagram("state","taste");
           
           System.out.println();
          
           isAnagram("PreInsta","InstaPrep");
           isAnagram("elow","below");
           isAnagram("cat","tahc");
           isAnagram("arc","cr");
           isAnagram("night","hing");
           isAnagram("state","taees");
	}

}
