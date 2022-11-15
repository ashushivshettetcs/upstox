package logical_programs;

import java.util.Scanner;

public class accept_input_from_user {
	public static void main(String[] args ) {
		Scanner scan = new Scanner(System.in);
		//get first number from user
		System.out.println("ley user enter first number");
		int Num1 = scan.nextInt();
		//get second number from user
		System.out.println("ley user entr second number");
		int Num2 = scan.nextInt();
		//add two numbers
		System.out.println(Num1+Num2);
		
	}

}
