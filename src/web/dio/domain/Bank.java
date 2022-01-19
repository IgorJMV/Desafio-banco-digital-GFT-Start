package web.dio.domain;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import lombok.Getter;

@Getter
public class Bank {
	private String name;
	private Set<Account> accounts = new HashSet<>();
	
	public Bank(String name) {
		this.name = name;
	}
	
	public Account findByNumber(String number) {
		Account acc = accounts.stream().filter(a -> a.getNumber().equals(number)).collect(Collectors.toList()).get(0);
		return acc;
	}
	
}
