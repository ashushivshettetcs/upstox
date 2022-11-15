package logical_programs;

import java.util.Scanner;

public class replace_spl_chrs {
public static void main (String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("enter string which contains spl chars");
String name = s.next();
String correctname = name.replace("@", "s");
System.out.println(correctname);
}
}
