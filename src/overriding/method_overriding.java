package overriding;

public class method_overriding {//ulc
	public static void main(String[] args) {
		System.out.println("take talk of cat");
		cat c= new cat();
		c.talk();
		System.out.println("take talk of dog");
		dog d= new dog();
		d.talk();
	}

}
