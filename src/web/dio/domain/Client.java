package web.dio.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import web.dio.domain.enums.EntityType;

@Getter
public class Client {
	private String name;
	private String cpfOrCnpj;
	private EntityType entityType;
	private List<Address> adresses = new ArrayList<>();
	private List<Phone> phones = new ArrayList<>();
	
	public Client(String name, String cpfOrCnpj, EntityType entityType) {
		this.name = name;
		this.cpfOrCnpj = cpfOrCnpj;
		this.entityType = entityType;
	}
}
