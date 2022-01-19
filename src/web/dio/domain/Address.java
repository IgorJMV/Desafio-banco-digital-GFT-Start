package web.dio.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * Classe que modela o endereço de um cliente
 * 
 * @author Igor Marinho
 * @version 1.0.0
 * @since Release 1.0.0
 * @see City
 */

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class Address {
	private Integer number;
	private String neighborhood;
	private String street;
	private City city;
}
