package com.bank.ebanking.models;

/**
 * Transfer Pojo file to derive data element require for account table
 * 
 * @author AkashRastogi
 *         
 *
 */
public class Transfer {

	private Long fromAccount;

	private Long toAccount;

	private Long transferAmount;

	public Transfer(Long fromAccount, Long toAccount, Long transferAmount) {
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.transferAmount = transferAmount;
	}

	public Transfer() {

	}

	public Long getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(Long fromAccount) {
		this.fromAccount = fromAccount;
	}

	public Long getToAccount() {
		return toAccount;
	}

	public void setToAccount(Long toAccount) {
		this.toAccount = toAccount;
	}

	public Long getTransferAmount() {
		return transferAmount;
	}

	public void setTransferAmount(Long transferAmount) {
		this.transferAmount = transferAmount;
	}
}
