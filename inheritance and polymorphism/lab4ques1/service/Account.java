package bankaccount.serviceImpl;

public class Account 
	{
		long accNum;
		public double balance;
		Person accHolder;
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
		public Person getAccHolder() {
			return accHolder;
		}
		public void setAccHolder(Person accHolder) {
			this.accHolder = accHolder;
		}
		public double deposit(double amount) {
			balance=balance+amount;
			return balance; 
		}

		public double withdraw(double amt)
		{
			balance=balance-amt;
			return balance;
		}
		
		
	}


