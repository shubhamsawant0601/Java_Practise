package String;

public class Toggle {
	static void toggle(String a) {
		String s = "";
		for (int i = 0; i <a.length(); i++){
			
			if(Character.isUpperCase(a.charAt(i))){
		         s = s + Character.toLowerCase(a.charAt(i));
		    }else {
		    	 s = s + Character.toUpperCase(a.charAt(i));
		    }
			
		}
		
		System.out.println(s);
	}

	public static void main(String[] args) {
          toggle("ShUbHaM");
	}

}
