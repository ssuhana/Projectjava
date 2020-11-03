package day5_2110;
import java.util.Random;
public class SavingsAccount extends Account{
	final double minibal=1000;
	void withdraw(double d)
	{
		if(balance>minibal)
		{
			balance=balance-d;
			System.out.println("after withdraw your current balance is:"+balance);
		}
		else {
			System.out.println("Innsufficient balance");
			
		}
	}
	public static void main(String[] args)
	{
		Account b=new SavingsAccount();
		Account obj=new SavingsAccount();
		Person obj1=new Person();
		Person q=new Person();
		Random ran=new Random();
		obj.setAccNum((long)ran.nextInt(9999999)+9999999);
		obj.setBalance(1000);
		obj1.setName("suha");
		obj1.setAge(21);
		obj1.setAcc_holder(obj);
		obj1.display();
		obj.updBalance();
		obj.withdraw(3000);
		b.setAccNum((long)ran.nextInt(9999999)+9999999);
		b.setBalance(4000);
		q.setName("suba");
		q.setAge(21);
		q.setAcc_holder(b);
		q.display();
		b.updBalance();
		b.deposit(2000);
	}

}
