package bankaccount.serviceImpl;

	class CurrentAccount extends Account
	{
		final float overDraftLimit=6000;
		@Override
		public double withdraw(double amt)
			{
				boolean flag=true;
				if(amt>overDraftLimit)
				{
					flag=false;
					System.out.println(flag);
				}
				return amt;			
		}
	}


