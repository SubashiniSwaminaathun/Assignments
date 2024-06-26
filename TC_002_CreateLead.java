package testcase;

import org.testng.annotations.Test;

import base.ProjSpecifications;
import pages.Login;

public class TC_002_CreateLead extends ProjSpecifications{
	
	@Test
	public void createNewLead() {
		Login obj=new Login(driver);
		obj.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickCRMSFA()
		.clickLead()
		.clickCreatelead()
		.enterCompany()
		.enterFname()
		.enterLname()
		.clickSubmit()
		.verify();
	}

}
