package com.capgemini.employeepayrollservice;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import com.capgemini.employeepayrollservice.EmployeePayrollServiceMain.IOService;

public class EmployeePayrollServiceTest {

	@Test
	public void given3EmployeesWhenWrittenToFileShouldMatchNumberOfEmployeeEntries() {
		EmployeePayrollData[] arrayOfEmployees = { 
				new EmployeePayrollData(1, "Abhijeet Kumar Giri", 50000.0),
				new EmployeePayrollData(2, "Amit Kumar", 50000.0),
				new EmployeePayrollData(3, "Rapeti Ganesh", 500000.0) };
		EmployeePayrollServiceMain payrollServiceObject = new EmployeePayrollServiceMain(Arrays.asList(arrayOfEmployees));
		payrollServiceObject.writeEmployeeDdate(IOService.FILE_IO);
		payrollServiceObject.printEmployeePayrollData();
		Assert.assertEquals(3, payrollServiceObject.countEnteries(IOService.FILE_IO));
	}

	
	@Test
	public void given3EmployeesWhenReadFromFileShouldMatchNumberOfEmployeeEntries() {

		EmployeePayrollServiceMain payrollServiceObject = new EmployeePayrollServiceMain();
		payrollServiceObject.readEmployeeData(IOService.FILE_IO);
		int countOfEntriesRead = payrollServiceObject.sizeOfEmployeeList();
		Assert.assertEquals(3, countOfEntriesRead);
	}
}
