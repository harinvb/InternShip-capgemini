package bank;

public class SavingsAccount extends Account {
	final double minimumBalance =500;
	SavingsAccount(String name,float age,double initialBalance){
		super(name,age,initialBalance);
	}
	
	@Override
	public void withdraw(double withdrawAmount) {
		if(super.balance<=this.minimumBalance) {
			System.out.println("Account Balance is below Minimum ");
		}
		else super.balance-=withdrawAmount;
	}
	
}
