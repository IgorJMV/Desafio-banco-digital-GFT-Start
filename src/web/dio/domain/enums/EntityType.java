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
public enum EntityType {
	INDIVIDUAL_ENTITY ("Pessoa física"),
	LEGAL_ENTITY ("Pessoa jurídica");
	
	private String description;
	
	@Override
	public String toString() {
		return description;
	}
}
