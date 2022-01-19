package web.dio.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import web.dio.domain.enums.EntityType;

/**
 * Classe que representa um cliente, com todos os dados de identifica��o necess�rios
 * 
 * @author Igor Marinho
 * @version 1.0.0
 * @since Release 1.0.0
 * @see Address
 * @see Phone
 */

@Getter
public class Client {
	private String name;
	private String cpfOrCnpj;
	private EntityType entityType;
	private List<Address> adresses = new ArrayList<>();
	private List<Phone> phones = new ArrayList<>();
	
	/**
	 * Construtor da classe
	 * 
	 * @param name			Nome do cliente
	 * @param cpfOrCnpj 	CPF ou NCPJ do cliente de acordo com o par�metro entityType
	 * @param entityType	Tipo de pessoa (f�sica ou jur�dica)
	 */
	public Client(String name, String cpfOrCnpj, EntityType entityType) {
		this.name = name;
		this.cpfOrCnpj = cpfOrCnpj;
		this.entityType = entityType;
	}
}
