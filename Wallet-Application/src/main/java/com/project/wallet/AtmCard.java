package com.project.wallet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AtmCard {
	@Value("10000")
	private String cashwithdrawal;
	@Value("8968")
	private int pinchange;
	@Value("599")
	private String Bsnlbillpayments;
	@Value("1Lac")
	private String cashdeposit;
	
	public AtmCard() {
		System.out.println("object is created:"+this.getClass().getSimpleName());
	}

	public String getCashwithdrawal() {
		return cashwithdrawal;
	}

	public void setCashwithdrawal(String cashwithdrawal) {
		this.cashwithdrawal = cashwithdrawal;
	}

	public int getPinchange() {
		return pinchange;
	}

	public void setPinchange(int pinchange) {
		this.pinchange = pinchange;
	}

	public String getBsnlbillpayments() {
		return Bsnlbillpayments;
	}

	public void setBsnlbillpayments(String bsnlbillpayments) {
		Bsnlbillpayments = bsnlbillpayments;
	}

	public String getCashdeposit() {
		return cashdeposit;
	}

	public void setCashdeposit(String cashdeposit) {
		this.cashdeposit = cashdeposit;
	}

	@Override
	public String toString() {
		return "AtmCard [cashwithdrawal=" + cashwithdrawal + ", pinchange=" + pinchange + ", Bsnlbillpayments="
				+ Bsnlbillpayments + ", cashdeposit=" + cashdeposit + "]";
	}

	
	

}
