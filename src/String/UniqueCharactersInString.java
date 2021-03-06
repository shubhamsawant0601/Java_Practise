package string;

public class UniqueCharactersInString {
	public void UniqueChar(String s) {
		System.out.println("Unique Characters in String are ");
    	for (int i = 0; i < s.length(); i++) {
		     char s1 = s.charAt(i);
		     int  count = 0;
		    
		     for (int j = 0; j < s.length(); j++) {
				if (s1==s.charAt(j)) {
					count++;
				}
			    }
		     if (count==1) {
				System.out.print(s1+" ");
			    }
		}
        }
	public static void main(String[] args) {
		UniqueCharactersInString u = new UniqueCharactersInString();
		
		//ans should be dfghj
		String s = "qdwfrygxialbetnhmjoialvcbnxmyruocvcnqwxmouetr";
		u.UniqueChar(s);

	}
}
