package bank;
class Account {

	static long actCount =202100000;
	private long accNum;
	protected double balance;
	private Person accHolder;
	
	Account(String name,float age,double initialBalance){
		this.accNum=++actCount;
		this.balance=initialBalance;
		this.accHolder = new Person(name,age);
	}
	
	public void deposit(double depositAmount) {
		this.balance+=depositAmount;
	}
	public void withdraw(double withdrawAmount) {
		this.balance-=withdrawAmount;
	}
	public double getBalance() {
		return this.balance;
	}
	
	public long getAccNum() {
		return this.accNum;
	}
	
	public String getAccHolderDetails() {
		return "Account Number:\t"+this.accNum+"\nAccount Holder Name:\t"+accHolder.getPersonName()+"\nAge :\t"+accHolder.getPersonAge();
	}
}
