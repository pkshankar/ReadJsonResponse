package com.qa.tests;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.employee.pojo.Accounting;
import com.qa.employee.pojo.Department;
//import com.qa.employee.pojo.Department;
import com.qa.employee.pojo.Details;
import com.qa.employee.pojo.Sales;

public class CreateEmployeeJson {

	@Test
	public void createEmployeeJson() throws JsonProcessingException {

		ObjectMapper mapper = new ObjectMapper();
		
		Details[] details1 = new Details[2];
		details1[0] = new Details("Shawn","Mike",31);
		details1[1] = new Details("Jon","Peter",24);
		Accounting accounting = new Accounting(details1);

//		Accounting[] accounting = new Accounting[2];
//		accounting[0] = new Accounting("Shawn","Mike",31);
//		accounting[1] = new Accounting("Jon","Peter",24);
//		Sales[] sales = new Sales[2];
//		sales[0] = new Sales("Som", "Ved", 21);
//		sales[1] = new Sales("Jin", "Lup", 34);
//		Department department = new Department(accounting, sales);
		String str = mapper.writeValueAsString(accounting);
		System.out.println(str);
		
//		Details[] details1 = new Details[2];
//		details1[0] = new Details("Shawn","Mike",31);
//		details1[1] = new Details("Jon","Peter",24);
//		Accounting accounting = new Accounting(details1);
//		Details[] details2 = new Details[2];
//		details2[0] = new Details("Som", "Ved", 21);
//		details2[1] = new Details("Jin", "Lup", 34);
//		Sales sales = new Sales(details2);
		//Department<Accounting, Sales> department = new Department<Accounting, Sales>(accounting, sales);
		//String str = mapper.writeValueAsString(department);
		//System.out.println(str);
		

//		EmployeeDetails[] emp1Details = new EmployeeDetails[2];
//		emp1Details[0] = new EmployeeDetails("Shawn","Mike",31);
//		emp1Details[1] = new EmployeeDetails("Jon","Peter",24);
//		Accounting accounting = new Accounting(emp1Details);
//		String str = mapper.writeValueAsString(accounting);
//		System.out.println(str);
//		EmployeeDetails emp2Details = new EmployeeDetails("Shawn","Mike",31);
//		Accounting[] accounting = new Accounting[2];
//		accounting[0] = new Accounting(emp1Details);
//		accounting[1] = new Accounting(emp2Details);
//		String str = mapper.writeValueAsString(accounting);
//		System.out.println(str);

	}

}
