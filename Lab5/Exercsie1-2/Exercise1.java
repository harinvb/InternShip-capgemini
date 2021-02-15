

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) throws InvalidAgeException {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter Age: \t");
		int age;
		try {
			age=scan.nextInt();
			if(age<=15) throw new InvalidAgeException(age);
			else System.out.println("Age accepted");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			scan.close();
		}
	}
	

}

class InvalidAgeException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	InvalidAgeException(int age) {
		super("Age Should be above 15 recieved age is "+age );
	}
	}
