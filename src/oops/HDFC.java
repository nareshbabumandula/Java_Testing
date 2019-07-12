package oops;

public class HDFC implements RBI{

	public static void main(String[] args) {
		HDFC hd = new HDFC();
		hd.RetirementPlan();
		hd.AccountType();
		hd.MinDeposit();
		hd.MaxDeposit();
		hd.Loans();
		hd.MinWithdrawl();
		hd.MaxWithdrawl();
		
	}

	@Override
	public void AccountType() {
		System.out.println("Executing AccountType method...");
		
	}

	@Override
	public void MinDeposit() {
		System.out.println("Executing MinDeposit method...");
		
	}

	@Override
	public void MaxDeposit() {
		System.out.println("Executing MaxDeposit method...");
		
	}

	@Override
	public void Loans() {
		System.out.println("Executing Loans method...");
		
	}

	@Override
	public void MinWithdrawl() {
		System.out.println("Executing MinWithdrawl method...");
		
	}

	@Override
	public void MaxWithdrawl() {
		System.out.println("Executing MaxWithdrawl method...");
		
	}

}
