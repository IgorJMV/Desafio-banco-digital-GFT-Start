package web.dio.domain.interfaces;

import web.dio.domain.Account;

public interface AccountContract {
	public void deposit(Double value);
	public void withdraw(Double value);
	public void transfer(Double value, Account account);
}
