package web.dio.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import web.dio.domain.interfaces.AccountContract;

@Getter
public abstract class Account implements AccountContract{
	private String agency;
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

	@Override
	public void deposit(Double value) {
		if(value <= 0.0)
			throw new IllegalArgumentException("Valor de depósito inválido.");
		
		amount += value;		
	}

	@Override
	public void withdraw(Double value) {
		if(value <= 0.0 && value <= amount)
			throw new IllegalArgumentException("Valor inválido de saque ou saldo insuficiente.");
		
		amount -= value;
	}

	@Override
	public void transfer(Double value, Account account) {
		this.withdraw(value);
		account.deposit(value);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("--- " + client.getName() + " ---");
		sb.append(agency + " * " + number);
		
		return sb.toString();
	}
}
