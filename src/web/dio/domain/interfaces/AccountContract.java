package web.dio.domain.interfaces;

import web.dio.domain.Account;

/**
 * @author Igor Marinho
 * @version 1.0.0
 * @since Release 1.0.0
 */

public interface AccountContract {
	public void deposit(Double value);
	public void withdraw(Double value);
	public void transfer(Double value, Account account);
}
