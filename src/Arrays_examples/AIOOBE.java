package Arrays_examples;

public class AIOOBE {
	public static void main(String[] args) {
		String ar[]=new String[5];
		ar[0]="Samantha";
		ar[1]="rashmika";
		ar[2]="sai pallavi";
		ar[3]="niveda thomas";
		ar[4]="kirthy suresh";
		//print the data which is not present
		try {
			System.out.println(ar[5]);//AIOOBE
		}
		catch(ArrayIndexOutOfBoundsException donkey) {
			System.out.println("idiot there is no data still u r trying to fetch it means u r waste fellow");
		}
	}

}
