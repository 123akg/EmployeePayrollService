package com.capgemini.employeepayrollservice;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class EmployeePayrollServiceMain {
	

	public static final Scanner SC = new Scanner(System.in);
	private List<EmployeePayrollData> employeeList;

	public EmployeePayrollServiceMain() {
		this.employeeList = new ArrayList<EmployeePayrollData>();
	}

	public EmployeePayrollServiceMain(List<EmployeePayrollData> employeeList) {
		this.employeeList = employeeList;
	}

	public void readEmployeeData() {
		System.out.println("Enter Employee Id:");
		int employeeId = SC.nextInt();
		System.out.println("Enter Employee Name:");
		SC.nextLine();
		String employeeName = SC.nextLine();
		System.out.println("Enter Employee Salary:");
		double employeeSalary = SC.nextDouble();
		EmployeePayrollData newEmployee = new EmployeePayrollData(employeeId, employeeName, employeeSalary);
		employeeList.add(newEmployee);
	}

	public void writeEmployeeDdate() {
		for (EmployeePayrollData o : employeeList)
			System.out.println(o.toString());
	}

	public static void main(String[] args) {
		EmployeePayrollServiceMain serviceObject = new EmployeePayrollServiceMain();
		serviceObject.readEmployeeData();
		serviceObject.writeEmployeeDdate();
	}

}
