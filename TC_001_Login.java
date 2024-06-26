package testcase;

import org.testng.annotations.Test;

import base.ProjSpecifications;
import pages.Login;

public class TC_001_Login extends ProjSpecifications{
	
	@Test
	public void verifyLogin() {
		Login obj=new Login(driver);
		obj.enterUsername()
		.enterPassword()
		.clickLogin()
		.verifyLogin();
	}

}
