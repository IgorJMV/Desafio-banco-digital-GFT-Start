package web.dio;

import web.dio.domain.Account;
import web.dio.domain.Address;
import web.dio.domain.Bank;
import web.dio.domain.City;
import web.dio.domain.Client;
import web.dio.domain.CurrentAccount;
import web.dio.domain.Phone;
import web.dio.domain.SavingsAccount;
import web.dio.domain.State;
import web.dio.domain.enums.EntityType;

public class Program {

	public static void main(String[] args) {
		City city = new City("São Paulo", new State("São Paulo"));
		Address address1 = new Address(109, "Bairro 1", "Rua 1", city);
		Address address2 = new Address(55, "Bairro 2", "Rua 2", city);
		
		Client client1 = new Client("João", "222.625.985-05", EntityType.INDIVIDUAL_ENTITY);
		client1.getAdresses().add(address1);
		client1.getPhones().add(new Phone("11 90899 - 4668"));
		Client client2 = new Client("Maria", "02.111.022/0001-05", EntityType.LEGAL_ENTITY);
		client2.getAdresses().add(address2);
		client2.getPhones().add(new Phone("11 90891 - 1688"));
		
		Account acc1 = new CurrentAccount("308-5", "61", client1, 5.0);
		Account acc2 = new SavingsAccount("308-5", "62", client2, 3.0);
		
		Bank bb = new Bank("Bradesco");
		bb.getAccounts().add(acc1);
		bb.getAccounts().add(acc2);
		
		bb.findByNumber("61").deposit(1500.00);
		bb.findByNumber("61").transfer(100.00, bb.findByNumber("62"));
		bb.findByNumber("61").withdraw(150.00);
		
		System.out.println("____________EXTRATO - Conta: " + acc1.getNumber() + "____________");
		bb.findByNumber("61").bankStatement();
		System.out.println("____________EXTRATO - Conta: " + acc2.getNumber() + "____________");
		bb.findByNumber("62").bankStatement();

	}

}
