package web.dio.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EntityType {
	INDIVIDUAL_ENTITY ("Pessoa f�sica"),
	LEGAL_ENTITY ("Pessoa jur�dica");
	
	private String description;
	
	@Override
	public String toString() {
		return description;
	}
}
