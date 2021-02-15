package bank;

public class Lab4 {

	public static void main(String[] args) {
		//1st step
		Account smith = new Account("Smith",21f,2000);
		Account kathy = new Account("Kathy",21f,3000);
		
		//2nd step
		smith.deposit(2000);
		
		//3rd step
		kathy.withdraw(2000);
		
		//4th step
		System.out.println(smith.getAccHolderDetails() +"\nBalance :\t"+smith.getBalance()+"\n*********\n");
		System.out.println(kathy.getAccHolderDetails() +"\nBalance :\t"+kathy.getBalance()+"\n*********\n");
	}

}
