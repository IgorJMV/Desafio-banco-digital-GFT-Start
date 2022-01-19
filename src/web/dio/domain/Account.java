package web.dio.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode.Include;
import lombok.Getter;
import web.dio.domain.enums.TransactionType;
import web.dio.domain.interfaces.AccountContract;

/**
 * Classe abstrata responsável por modelar uma conta bancária
 * 
 * @author Igor Marinho
 * @version 1.0.0
 * @since Release 1.0.0
 * @see Client
 * @see Transaction
 */

@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public abstract class Account implements AccountContract{
	private String agency;
	@Include
	private String number;
	private Double amount;
	private Client client;
	private List<Transaction> bankStatement = new ArrayList<>();	
	
	/**
	 * Construtor da classe
	 * 
	 * @param agency	Agência
	 * @param number	Número da conta
	 * @param client	Cliente titular da conta
	 */
	public Account(String agency, String number, Client client) {
		this.agency = agency;
		this.number = number;
		this.client = client;
		this.amount = 0.0;
	}
	
	/**
	 * Exibe o extrato bancário
	 */
	public void bankStatement(){
		for(Transaction t : bankStatement)
			System.out.println(t);
	}
	
	/**
	 * Realiza depósitos
	 * 
	 * @param value		Valor a ser depositado
	 * @throws IllegalArgumentException Se o valor a ser depositado for menor ou igual a 0
	 */
	@Override
	public void deposit(Double value) {
		if(value <= 0.0)
			throw new IllegalArgumentException("Valor de depósito inválido.");
		
		amount += value;
		bankStatement.add(new Transaction(value, new Date(), TransactionType.DEPOSIT));
	}

	/**
	 * Realiza saques
	 * 
	 * @param value		Valor a ser sacado
	 * @throws IllegalArgumentException Se o valor a ser sacado for menor ou igual a 0 ou maior que o saldo
	 */
	@Override
	public void withdraw(Double value) {
		if(value <= 0.0 || value > amount)
			throw new IllegalArgumentException("Valor inválido de saque ou saldo insuficiente.");
		
		amount -= value;
		bankStatement.add(new Transaction(value, new Date(), TransactionType.WITHDRAW));
	}

	/**
	 * Realiza transferências
	 * 
	 * @param value		Valor a ser transferido
	 * @throws IllegalArgumentException Se o valor a ser transferido for menor ou igual a 0 ou maior que o saldo
	 */
	@Override
	public void transfer(Double value, Account account) {
		if(value <= 0.0 || value > amount)
			throw new IllegalArgumentException("Valor inválido de saque ou saldo insuficiente.");
		
		amount -= value;
		account.deposit(value);
		bankStatement.add(new Transaction(value, new Date(), TransactionType.TRANSFER));
	}

	/**
	 * toString
	 * 
	 * @return Imprime uma conta bancária
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("--- " + client.getName() + " ---\n");
		sb.append(agency + " * " + number);
		
		return sb.toString();
	}
}
