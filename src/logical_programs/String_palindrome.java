package logical_programs;

public class String_palindrome {
public static void main(String[] args) {
	String org="wow";
	String rev="";
	for(int i=org.length()-1;i>=0;i--) {
		rev=rev+org.charAt(i);
	}
	System.out.println(rev);
	//check whether it is palindrome
	if(org.equals(rev)) {
		System.out.println("given string is palindrome");
	}
	else {
		System.out.println("given string is not palindrome");
				
				
	}
	
}
}
