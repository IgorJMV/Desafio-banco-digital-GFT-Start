package web.dio.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

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
