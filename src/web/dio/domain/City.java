package web.dio.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * Classe que representa uma cidade
 * 
 * @author Igor Marinho
 * @version 1.0.0
 * @since Release 1.0.0
 * @see State
 */

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class City {
	private String name;
	private State state;
}
