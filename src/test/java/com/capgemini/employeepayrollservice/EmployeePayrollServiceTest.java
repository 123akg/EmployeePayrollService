package com.capgemini.employeepayrollservice;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import com.capgemini.employeepayrollservice.EmployeePayrollServiceMain.IOService;

public class EmployeePayrollServiceTest {

	@Test
	public void given3EmployeesWhenWrittenToFileShouldMatchNumberOfEmployeeEntries() {
		EmployeePayrollData[] arrayOfEmployees = { 
				new EmployeePayrollData(1, "Abhijeet Kumar Giri, 50000.0),
				new EmployeePayrollData(2, "Amit Kumar", 50000.0),
				new EmployeePayrollData(3, "apeti Ganesh", 50000.0) };
		EmployeePayrollServiceMain payrollServiceObject = new EmployeePayrollServiceMain(Arrays.asList(arrayOfEmployees));
		payrollServiceObject.writeEmployeeDdate(IOService.FILE_IO);
		Assert.assertEquals(3, payrollServiceObject.countEnteries(IOService.FILE_IO));
	}

}
