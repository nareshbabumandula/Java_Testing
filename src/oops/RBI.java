package oops;

public interface RBI {
	
	abstract void AccountType();
	abstract void MinDeposit();
	abstract void MaxDeposit();
	abstract void Loans();
	abstract void MinWithdrawl();
	abstract void MaxWithdrawl();

	
	public static void LoanCancellation()
	{
		System.out.println("Executing loan cancellation method...");
	}
	
	
	public default void RetirementPlan()
	{
		System.out.println("Executing RetirementPlan method...");
	}
	
	
	public static void main(String[] args)
	{
		LoanCancellation();
	}

}
