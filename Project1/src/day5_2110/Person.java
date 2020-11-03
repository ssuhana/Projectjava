package day5_2110;

public class Person {
	Account acc_holder;//custom type account
	 public Account getAcc_holder() {
		return acc_holder;
	}
	public void setAcc_holder(Account acc_holder) {
		this.acc_holder = acc_holder;
	}
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private float age;
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	void display()
	{
		System.out.println("Name: "+name+"\nage: "+age);
	}
}
   class Account{
	long accNum;
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	double balance;
	void deposit(double d) {
		balance=balance+d;
		System.out.println("After deposit the balance is"+balance);
		
	}
	void withdraw(double w) {
		balance=balance-w;
	}
	void updBalance() {
		System.out.println("Account number: "+accNum+ "\nBalance: "+balance);
		
	}
}