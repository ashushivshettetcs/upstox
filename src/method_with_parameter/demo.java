package method_with_parameter;

public class demo {
	public static void main(String[] args) {
		addition(10.5,20);//compile time binding(CTB)
	}
	public static void addition(double a,int b){//formal arguments
	double c=a+b;
	System.out.println(c);
}

}
