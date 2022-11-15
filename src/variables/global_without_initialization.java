package variables;

public class global_without_initialization {//class body open
	static byte b;
	static short s;
	static int i;
	static long l;
	static double d;
	static float f;
	static char ch;
	static boolean g;
	static String v; 
	
	public static void main (String[] args) {//main method body open
		System.out.println(b);//0
		System.out.println(s);//0
		System.out.println(i);//0
		System.out.println(l);//0
		System.out.println(d);//0.0
		System.out.println(f);//0.0
		System.out.println(ch);//empty box
		System.out.println(g);//false
		System.out.println(v);//null
		
	}

}
