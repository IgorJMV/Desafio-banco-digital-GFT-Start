package web.dio.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Esta classe modela o número de telefone/celular do cliente 
 * 
 * @author Igor Marinho
 * @version 1.0.0
 * @since Release 1.0.0
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Phone {
	private String number;
}
