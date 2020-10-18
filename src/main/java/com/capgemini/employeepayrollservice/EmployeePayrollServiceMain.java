package com.capgemini.employeepayrollservice;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class EmployeePayrollServiceMain {
	

	public enum IOService {
		CONSOLE_IO, FILE_IO, DB_IO, REST_IO
	}

	public static final Scanner SC = new Scanner(System.in);
	private List<EmployeePayrollData> employeeList;

	public EmployeePayrollServiceMain() {
		this.employeeList = new ArrayList<EmployeePayrollData>();
	}

	public EmployeePayrollServiceMain(List<EmployeePayrollData> employeeList) {
		this.employeeList = employeeList;
	}

	public void readEmployeeData() {
		System.out.println("Enter employee id:");
		int employeeId = SC.nextInt();
		System.out.println("Enter employee name:");
		SC.nextLine();
		String employeeName = SC.nextLine();
		System.out.println("Enter employee salary:");
		double employeeSalary = SC.nextDouble();
		EmployeePayrollData newEmployee = new EmployeePayrollData(employeeId, employeeName, employeeSalary);
		employeeList.add(newEmployee);
	}

	public void writeEmployeeDdate(IOService ioType) {
		if (ioType.equals(IOService.CONSOLE_IO)) {
			for (EmployeePayrollData o : employeeList)
				System.out.println(o.toString());
		} else if (ioType.equals(IOService.FILE_IO)) {
			new EmployeePayrollFileIOService().writeData(employeeList);
		}
	}

	public long countEnteries(IOService ioType) {
		if (ioType.equals(IOService.FILE_IO))
			return new EmployeePayrollFileIOService().countEntries();
		return 0;
	}

}
