package zad1;

public class Account 
{
	double balance;
	static double interestRate;
	
	public Account()
	{
		this.balance = 0;
	}
	
	public double deposit(double money)
	{
		if(money <= 0)
		{
			return balance;
		}
		return balance += money;
	}
	
	public double withdraw(double money)
	{
		if(money > balance || money <= 0)
		{
			return balance;
		}
		return balance -= money;
	}
	
	public double transfer(Account account, double money)
	{
		if(this.balance < money || money < 0)
		{
			return balance;
		}
		this.balance -= money;
		account.balance += money;
		return balance;
	}

	public double addInterest()
	{
		return this.balance += balance * interestRate;
	}

	public static double setInterestRate(double iRate)
	{
		return interestRate = iRate / 100;
	}

}
