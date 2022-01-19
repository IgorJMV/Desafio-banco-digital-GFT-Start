package web.dio.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TransactionType {
	DEPOSIT ("Depósito"),
	WITHDRAW ("Saque"),
	TRANSFER ("Transferência");
	
	private String description;
	
	@Override
	public String toString() {
		return description;
	}
}
