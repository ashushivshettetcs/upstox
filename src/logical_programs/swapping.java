package logical_programs;

public class swapping {
public static void main(String[] args) {
/*	System.out.println("before swapping");
	int a=10;
	int b=20;
	System.out.println(a+"and"+b);
	//using 3rd variable
	int c=a;
	a=b;
	b=c;
	System.out.println("After swapping"+a+"and"+b);*/
	//without using 3rd variable
	int a=10;int b=20;
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After swapping"+a+b);
}
}
