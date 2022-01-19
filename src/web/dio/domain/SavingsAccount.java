package web.dio.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * Essa classe representa uma conta poupança. É uma classe filha da classe Account
 * 
 * @author Igor Marinho
 * @version 1.0.0
 * @since Release 1.0.0
 * @see Account
 */

@Getter
@Setter
public class SavingsAccount extends Account{
	private Double interestRate;

	/**
	 * Construtor da classe
	 * 
	 * @param agency		Agência
	 * @param number		Número da conta
	 * @param client		Cliente titular da conta
	 * @param interestRate  Taxa, em porcentagem, de juros da conta
	 */
	public SavingsAccount(String agency, String number, Client client, Double interestRate) {
		super(agency, number, client);
		this.interestRate = interestRate;
	}
	
	/**
	 * Método usado para aplicar a taxa de juros sobre o saudo da conta
	 */
	public void updateBalance() {
		Double value = super.getAmount()*interestRate/100;
		this.deposit(value);
	}

}
