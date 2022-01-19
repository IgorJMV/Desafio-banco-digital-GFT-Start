package web.dio.domain;

import lombok.Getter;

/**
 * Classe que representa uma conta corrente. É uma classe filha da classe Account
 * 
 * @author Igor Marinho
 * @version 1.0.0
 * @since Release 1.0.0
 * @see Account
 */

@Getter
public class CurrentAccount extends Account{
	private Double percentageTax;

	/**
	 * Construtor da classe
	 * 
	 * @param agency		Agência
	 * @param number		Número da conta
	 * @param client		Cliente titular da conta
	 * @param percentageTax Taxa, em porcentagem, cobrada ao realizar um saque
	 */
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
