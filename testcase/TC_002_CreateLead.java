package testcase;

import org.testng.annotations.Test;

import base.ProjSpecifications;
import pages.Login;

public class TC_002_CreateLead extends ProjSpecifications{
	
	@Test
	public void createNewLead(String cname,String fname,String lname) {
		Login obj=new Login();
		obj.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickCRMSFA()
		.clickLead()
		.clickCreatelead()
		.enterCompany(cname)
		.enterFname(fname)
		.enterLname(lname)
		.clickSubmit()
		.verify();
	}

}
