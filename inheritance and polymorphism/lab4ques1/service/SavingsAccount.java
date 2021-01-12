package bankaccount.serviceImpl;


	public class SavingsAccount extends Account
	{
		final float minimumBalance = 500;
		@Override
		public double withdraw(double amt)
		{
			if(getBalance()<minimumBalance)
			{
				return balance;
			}
			else
			{
				return (balance-amt);
			}
		}
		

}
