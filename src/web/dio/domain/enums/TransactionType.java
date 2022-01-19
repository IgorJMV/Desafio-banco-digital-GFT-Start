package web.dio.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Igor Marinho
 * @version 1.0.0
 * @since Release 1.0.0
 */

@AllArgsConstructor
@Getter
public enum TransactionType {
	DEPOSIT ("Dep�sito"),
	WITHDRAW ("Saque"),
	TRANSFER ("Transfer�ncia");
	
	private String description;
	
	@Override
	public String toString() {
		return description;
	}
}
