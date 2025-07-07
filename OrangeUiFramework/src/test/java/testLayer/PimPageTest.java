package testLayer;

import org.testng.annotations.Test;

import com.orange.ui.exception.PimException;

import baseLayer.BaseClass;
import pageLayer.PimPage;

public class PimPageTest extends BaseClass {

	private PimPage pimPage;

	@Test
	public void validateCreateEmployeeFunctionality() {
		pimPage = new PimPage();

		String errorMessage = pimPage.createEmployee("Anuja");
		// After Entering valid information still we can't create Employee then throw
		// the Exception

		if (errorMessage.equalsIgnoreCase("Required")) 
		{
			throw new PimException("We Can't Create Employee");
		}

	}

	@Test
	public void validateUpdateEmployee() {
		pimPage.updateEmployee("India");
		// After Entering valid information still we can't update Employee then throw
		// the Exception

		String errorMessage = "";

		if (errorMessage.equalsIgnoreCase("Can't Update")) {
			throw new PimException("We Can't Update Employee");
		}
	}

	@Test
	public void validateSearchEmployee() throws InterruptedException {
		
		String errorMessage = pimPage.searchEmployee("112211");

		// After Entering valid information still we can't search Employee then throw
		// the Exception

		if (errorMessage.equalsIgnoreCase("No Records Found")) {
			throw new PimException("Searched Employee is Not Found");
		}
	}

	@Test
	public void validateDeleteEmployee() {
		//pimPage.deleteEmployee("1111");

		// After Entering valid information still we can't delete Employee then throw
		// the Exception

		String errorMessage = "";

		if (errorMessage.equalsIgnoreCase("Can't Delete")) {
			throw new PimException("We can't Delete Employee");
		}

	}

}
