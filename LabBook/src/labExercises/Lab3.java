package labExercises;
import java.util.regex.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Lab3 {

	public static void main(String[] args) {
		String exercise1=" 123  234 \n 456 678";
		stringTokenizer(exercise1);
		
		String exercise2 = "Hari";
		System.out.println(getImage(exercise2));
		
		String exercise3 = "JAVA";
		System.out.println(alterString(exercise3));
		
		int numberInput=94752;
		System.out.println(modifyNumber(numberInput));
		
		String exercise5 ="    Hari     Babu     \n cahsd \n sadsd";
		wordCounter(exercise5);
		
		String exercise9 ="JAVA";
		System.out.println(positiveString(exercise9));
		
		LocalDate presentDate = LocalDate.parse("23/11/2019", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		dateDifference(presentDate);
		

	}
	
	static void stringTokenizer(String inputString) {
		int result=0;
		Matcher m = Pattern.compile("\\d+").matcher(inputString);
		while(m.find()) {
			System.out.println(m.group());
			result+=Integer.parseInt(m.group());
		}
		System.out.println(result);
		
	}
	
	
	static String getImage(String inputString) {
		StringBuilder stringA = new StringBuilder(inputString);
		return stringA.toString() + " | " + stringA.reverse().toString();
	}
	
	static String alterString(String inputString) {
		char[] alterChars = inputString.toCharArray();
		for(int i=0;i<alterChars.length;i++) {
			if(!(alterChars[i]=='A' || alterChars[i]=='E' || alterChars[i]=='I' || alterChars[i]=='O' || alterChars[i]=='U' )) {
				alterChars[i] = (char)((int)(alterChars[i])+1);
			}
		}
		return String.copyValueOf(alterChars);
	}
	
	static int modifyNumber(int number1) {
		StringBuilder s = new StringBuilder("" + number1);
		int returnAns=0;
		for(int i=0;i<s.length()-1;i++) {
			returnAns *=10;
			returnAns +=Math.abs(s.charAt(i)-s.charAt(i+1));
		}
		return returnAns*10+(number1%10);
		
	}
	
	
	static void wordCounter(String inputString) {
		int count=0;
		Matcher m = Pattern.compile("\\w+").matcher(inputString);
		while(m.find())count++;
		System.out.println("No of Words:"+count);
		m= Pattern.compile("\n").matcher(inputString);
		count=1;
		while(m.find())count++;
		System.out.println("No of Lines:"+count);
		m= Pattern.compile("[a-zA-Z]").matcher(inputString);
		count=0;
		while(m.find())count++;
		System.out.println("No of Characters:"+count);
		
	}
	
	static boolean positiveString(String inputCheck) {
		inputCheck = inputCheck.toUpperCase();
		for(int i=0;i<inputCheck.length()-1;i++) if(inputCheck.charAt(i)-inputCheck.charAt(i+1)>0)return false;
		return true;
	}
	
	static void dateDifference(LocalDate dateTwo) {
        LocalDate now = LocalDate.now();
 
        Period diff = Period.between(dateTwo, now);
 
     System.out.printf("Difference is "+diff.getYears()+" years "+diff.getMonths()+ " months " + diff.getDays()+" days");
	}
}
