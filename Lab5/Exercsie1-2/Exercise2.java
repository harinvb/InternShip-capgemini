


public class Exercise2 {

	public static void main(String[] args) throws InvalidNameException {
		// TODO Auto-generated method stub
		String firstName=" ";
		String lastName=" ";
		try {
			if((firstName.matches(" +") & lastName.matches(" +"))||
					(firstName.length()==0 & lastName.length()==0)
					) throw new InvalidNameException();
			else System.out.println("Name Accepted");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}

class InvalidNameException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	InvalidNameException(){
		super("Both of the First Name and Last Name is NULL");
	}
	
}
