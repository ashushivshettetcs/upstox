package static_nonstatic_varibles;

public class demo {
	static String s="velocity";
	String s1="ASHWINI";
	public static void main(String[] args) {
		System.out.println(s);
		demo d=new demo();
		System.out.println(d.s1);
	}

}
