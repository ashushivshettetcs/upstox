package Hierarchy;

public class hierarchy_1 {
	public static void main(String[] args) {
		System.out.println("properties of son1");
	son1 s1=new son1();
		s1.mobile();
		s1.money();
		s1.home();
		
		System.out.println("properties of son2");
		son2 s2 = new son2();
		s2.bike();
		s2.home();
		s2.money();
		
		System.out.println("properties of son3");
		son3 s3 = new son3();
		s3.laptop();
		s3.home();
		
		//s3.money();
		
	}

}


