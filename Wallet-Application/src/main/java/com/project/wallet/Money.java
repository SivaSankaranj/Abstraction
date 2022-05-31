package com.project.wallet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Money {
	@Value("MasterCard")
	private String card;
	@Value("5000")
	private String cash;
	@Value("Bearer")
	private String cheque;

	public Money() {
	System.out.println("object is created:"+this.getClass().getSimpleName());
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public String getCash() {
		return cash;
	}

	public void setCash(String cash) {
		this.cash = cash;
	}

	public String getCheque() {
		return cheque;
	}

	public void setCheque(String cheque) {
		this.cheque = cheque;
	}

	@Override
	public String toString() {
		return "Money [card=" + card + ", cash=" + cash + ", cheque=" + cheque + "]";
	}

}
