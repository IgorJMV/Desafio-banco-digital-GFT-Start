package web.dio.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class Address {
	private Integer number;
	private String neighborhood;
	private String street;
	private City city;
}
