package web.dio.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SavingsAccount extends Account{
	private Double interestRate;

	public SavingsAccount(String agency, String number, Client client, Double interestRate) {
		super(agency, number, client);
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		Double value = super.getAmount()*interestRate/100;
		this.deposit(value);
	}

}
