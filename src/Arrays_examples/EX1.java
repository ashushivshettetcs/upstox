package Arrays_examples;

public class EX1 {
public static void main(String[] args) {
	String ar[] = new String[5];
	ar[0]="samantha";
	ar[1]="rashmika";
	ar[2]="sai pallavi";
	ar[3]="niveda thomas";
	ar[4]="kirthy suresh";
	//print samantha
	System.out.println(ar[0]);
	//i want to print entire data in given array 
	for(int i=0;i<=4;i++) {
		System.out.println(ar[i]);
	}
}
}