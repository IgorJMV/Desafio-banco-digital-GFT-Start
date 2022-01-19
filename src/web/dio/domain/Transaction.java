package web.dio.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import web.dio.domain.enums.TransactionType;

/**
 * Classe que modela os dados uma uma transa��o banc�ria. Essa classe � usada para exibir o extrato banc�rio
 * 
 * @author Igor Marinho
 * @version 1.0.0
 * @since Release 1.0.0
 */

@AllArgsConstructor
@Getter
public class Transaction {
	protected static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	
	private Double amount;
	private Date instant;
	private TransactionType type;
	
	/**
	 * toString
	 * 
	 * @return Imprime uma transa��o no extrato banc�rio
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(type + " ---- " + df.format(instant));
		sb.append("\nValor: R$" + String.format("%.2f", amount));
		
		return sb.toString();
	}
}
