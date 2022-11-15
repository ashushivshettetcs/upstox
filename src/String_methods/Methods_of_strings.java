package String_methods;

public class Methods_of_strings {
public static void main(String[] args) {
	String s1="velocity";
	String s2="VELOCITY";
	String s3="velo";
	//lastindex of-->it will give index of duplicate character
	System.out.println(s1.lastIndexOf('t'));//1
	//startwith-->it will check whether string is started with particular character or not
	System.out.println(s1.startsWith("ve"));//true
	//endswith-->it will check whether string is ends with particular charcater or not
	System.out.println(s1.endsWith("ty"));//true
	//if we want to break the string -->substring()
	System.out.println(s1.substring(4));//city
	System.out.println(s1.substring(2));//locity
	//how to concat two strings-->concat()
	System.out.println(s1.concat(s3));//velocityvelo
	//replace method will replace the string
	System.out.println(s1.replace("city","rural" ));
}
}
