package conditiona_statement;

public class if_else_ladder {
	public static void main(String[] args) {
		int marks=72;
		if(marks>=75) {
			System.out.println("passed with distinction");
		}
			else if (marks>=60) {
				System.out.println("passed with 1st class");
			}
			else if (marks>=50) {
				System.out.println("passed with 2nd class");
			}
			else if(marks>=40) {
				System.out.println("passed with 3rd class");
			}
			else if(marks>=35) {
				System.out.println("pass");
			}
			else {
				System.out.println("fail");
				
			}
		}
	}
