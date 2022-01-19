package web.dio.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EntityType {
	INDIVIDUAL_ENTITY ("Pessoa física"),
	LEGAL_ENTITY ("Pessoa jurídica");
	
	private String description;
	
	@Override
	public String toString() {
		return description;
	}
}
