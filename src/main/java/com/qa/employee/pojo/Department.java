package com.qa.employee.pojo;

public class Department {
	
	private Accounting[] accounting;
	private Sales[] sales;
	
	public Department(Accounting[] accounting, Sales[] sales) {
		
		this.accounting = accounting;
		this.sales = sales;
	}

	public Accounting[] getAccounting() {
		return accounting;
	}

	public Sales[] getSales() {
		return sales;
	}
	
	
	
	
	
	
	
	

}
