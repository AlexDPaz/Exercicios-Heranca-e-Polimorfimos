package entities;

public class BusineesAccount extends Account {
	
	private Double loanLimit;
	
	public BusineesAccount() {
		super();
	}

	public BusineesAccount(Integer nunber, String holder, Double balance, Double loanLimit) {
		super(nunber, holder, balance);
		this.loanLimit = loanLimit;
	}
	
	public void loan (Double amount) {
		if (amount <= loanLimit) {
			deposit(amount);
		}
		
	}

}
