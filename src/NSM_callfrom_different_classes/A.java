package NSM_callfrom_different_classes;

public class A {//ulc
	public static void main(String[] args) {
		System.out.println("main method started");
		B b=new B();
		b.t1();
		b.t2();
		System.out.println("main method ended");
	}

}
