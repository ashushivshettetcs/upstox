package logical_programs;

import java.util.Scanner;

public class replace_multiple_spl_symbols {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("hey user print the string with special symbols");
	String name = scan.next();
	String correctname=name.replaceAll("[^a-z A-Z]","");
	System.out.println(correctname);
	
}
}
