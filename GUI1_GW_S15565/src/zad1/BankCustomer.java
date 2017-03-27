package zad1;

public class BankCustomer
{
	Person person;
	Account account;
	
	public BankCustomer(Person person)
	{
		this.person = person;
		this.account = new Account();
	}
	
	public Account getAccount()
	{
		return account;
	}
	
	public String toString()
	{
		return "Klient: " + this.person.name + 
				" stan konta " + this.getAccount().balance;
	}
}
