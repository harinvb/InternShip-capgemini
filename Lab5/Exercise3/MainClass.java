import com.cg.eis.exception.*;

public class MainClass {

	public static void main(String[] args) {
		long salary=2000L;
		try {
			if(salary<3000)throw new EmployeeException();
			else System.out.println("Salary Accepted");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
