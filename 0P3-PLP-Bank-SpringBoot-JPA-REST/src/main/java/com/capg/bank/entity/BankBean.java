package com.capg.bank.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bank_Spring")
public class BankBean {
 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + account_id;
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((contact_number == null) ? 0 : contact_number.hashCode());
		result = prime * result + ((customer_name == null) ? 0 : customer_name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankBean other = (BankBean) obj;
		if (account_id != other.account_id)
			return false;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (contact_number == null) {
			if (other.contact_number != null)
				return false;
		} else if (!contact_number.equals(other.contact_number))
			return false;
		if (customer_name == null) {
			if (other.customer_name != null)
				return false;
		} else if (!customer_name.equals(other.customer_name))
			return false;
		return true;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int account_id;
	
	private String customer_name;
	
	private double amount;
	
	private String contact_number;

	public int getAccount_id() {
		return account_id;
	}

	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getContact_number() {
		return contact_number;
	}

	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}

	@Override
	public String toString() {
		return "BankBean [account_id=" + account_id + ", customer_name=" + customer_name + ", amount=" + amount
				+ ", contact_number=" + contact_number + "]";
	}
	
	
}
