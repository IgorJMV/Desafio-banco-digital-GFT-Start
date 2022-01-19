package web.dio.domain;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import lombok.Getter;

/**
 * Classe que modela a entidade banco, é através dela que podemos acessar as contas bancárias
 * 
 * @author Igor Marinho
 * @version 1.0.0
 * @since Release 1.0.0
 * @see Account
 */

@Getter
public class Bank {
	private String name;
	private Set<Account> accounts = new HashSet<>();
	
	/**
	 * Construtor da classe
	 * 
	 * @param name	Nome do banco
	 */
	public Bank(String name) {
		this.name = name;
	}
	
	/**
	 * Retorna uma Account de acordo com o número informado
	 * 
	 * @param number	Número da conta que se deseja buscar
	 * @return Retorna a Account correspondente ao número informado no parâmetro
	 */
	public Account findByNumber(String number) {
		Account acc = accounts.stream().filter(a -> a.getNumber().equals(number)).collect(Collectors.toList()).get(0);
		return acc;
	}
	
}
