package web.dio.domain;

import lombok.Getter;

@Getter
public class CurrentAccount extends Account{
	private Double percentageTax;

	public CurrentAccount(String agency, String number, Client client, Double percentageTax) {
		super(agency, number, client);
		this.percentageTax = percentageTax;
	}
	
	@Override
	public void withdraw(Double value) {
		value += percentageTax/100*value;
		super.withdraw(value);
	}

}
