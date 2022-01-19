package web.dio.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode.Include;
import lombok.Getter;
import web.dio.domain.enums.TransactionType;
import web.dio.domain.interfaces.AccountContract;

@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public abstract class Account implements AccountContract{
	private String agency;
	@Include
	private String number;
	private Double amount;
	private Client client;
	private List<Transaction> bankStatement = new ArrayList<>();	
	
	public Account(String agency, String number, Client client) {
		this.agency = agency;
		this.number = number;
		this.client = client;
		this.amount = 0.0;
	}
	
	public void bankStatement(){
		for(Transaction t : bankStatement)
			System.out.println(t);
	}

	@Override
	public void deposit(Double value) {
		if(value <= 0.0)
			throw new IllegalArgumentException("Valor de depósito inválido.");
		
		amount += value;
		bankStatement.add(new Transaction(value, new Date(), TransactionType.DEPOSIT));
	}

	@Override
	public void withdraw(Double value) {
		if(value <= 0.0 && value <= amount)
			throw new IllegalArgumentException("Valor inválido de saque ou saldo insuficiente.");
		
		amount -= value;
		bankStatement.add(new Transaction(value, new Date(), TransactionType.WITHDRAW));
	}

	@Override
	public void transfer(Double value, Account account) {
		if(value <= 0.0 && value <= amount)
			throw new IllegalArgumentException("Valor inválido de saque ou saldo insuficiente.");
		
		amount -= value;
		account.deposit(value);
		bankStatement.add(new Transaction(value, new Date(), TransactionType.TRANSFER));
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("--- " + client.getName() + " ---\n");
		sb.append(agency + " * " + number);
		
		return sb.toString();
	}
}
