package collection;

import java.util.ArrayList;

public class arraylist {//dont confuse here we are talking about inbuilt class
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Ashwini");
		al.add(100);
		al.add('A');
		al.add(100);
		al.add(null);
		al.add(null);
		//print all data in class
		System.out.println(al);
		//get the size
		System.out.println(al.size());
		//check whether it is empty
		System.out.println(al.isEmpty());
		//insertion poeration
		al.add(3,500);
		System.out.println(al);
		//delete operation
		al.remove(3);
		System.out.println(al);
		
 	}

}
