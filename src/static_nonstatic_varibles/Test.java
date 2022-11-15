package static_nonstatic_varibles;

public class Test {
static int i=20;
int j=40;
public static void main(String[] args) {
	System.out.println(i);
	Test t= new Test();//object creation
	System.out.println(t.j);
}
}
