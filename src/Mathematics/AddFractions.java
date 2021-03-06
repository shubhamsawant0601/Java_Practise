package Numbers;

public class AddFractions {
	public static void addFractions(int n1,int d1,int n2,int d2) {
		int resultnum = ((n1*d2)+(n2*d1));
		int resultden = (d1*d2);
		int i = resultnum<resultden?resultnum:resultden;
	    while(i>0) {
			if (resultnum%i==0 && resultden%i==0) {
				resultnum = resultnum/i;
				resultden = resultden/i;
			}
			i--;
		}
		System.out.println("("+n1+"/"+d1+") + ("+n2+"/"+d2+") = ("+resultnum+"/"+resultden+")");
	}

	public static void main(String[] args) {
		addFractions(50,100,75,200);

	}
}
