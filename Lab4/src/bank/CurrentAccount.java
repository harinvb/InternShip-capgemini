package bank;

public class CurrentAccount extends Account{
	private double overDraftLimit = 10000;
	CurrentAccount(String name,float age,double initialBalance){
		super(name,age,initialBalance);
	}
	
	@Override
	public void withdraw(double withdrawAmount) {
		if(withdrawAmount>this.overDraftLimit) {
			System.out.println("OverDrafted ");
		}
		else super.balance-=withdrawAmount;
	}
}
