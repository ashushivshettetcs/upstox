package static_nonstatic_varibles;

public class sample {//class body open
	static int i=10;//static global variable
	int j=20;//non-static global varible
	
	public static void main(String[] args) {//main method body open
System.out.println(i);//since i is static varible so that we can print directly
sample s=new sample();
System.out.println(s.j);

	}

}
